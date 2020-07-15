package com.isoftstone.gdmt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isoftstone.gdmt.dao.OrganizationDao;
import com.isoftstone.gdmt.dao.ResourceMapper;
import com.isoftstone.gdmt.dao.RoleDao;
import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Organization;
import com.isoftstone.gdmt.model.Resource;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.service.RoleService;

public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //getOrganizationsByParentUUID("-1");
        //getResourcesByParentId("root");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		RoleDao roleDao = context.getBean(RoleDao.class);
//		List<Role> list = roleDao.selectByExample(null);
        RoleService service = context.getBean(RoleService.class);
        List<Role> list = service.findAll();
        System.out.println(list);
    }

    @SuppressWarnings("resource")
    public static List<Node> getOrganizationsByParentUUID(String parentUUID) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrganizationDao organDao = context.getBean(OrganizationDao.class);
        List<Organization> list = organDao.findByParentUUID(parentUUID);
        List<Node> nodes = new ArrayList<Node>();
        for (Organization org : list) {
            List<Organization> children = organDao.findByParentUUID(org.getOrgan_uuid());
            Node node = new Node();
            node.setId(org.getOrgan_uuid());
            node.setName(org.getOrgan_name());
            node.setPid(org.getParent_uuid());
            if (children.size() != 0) {
                node.setHasChildren(true);
                List<Node> byParentUUID = getOrganizationsByParentUUID(org.getOrgan_uuid());
                node.setChildren(byParentUUID);
            } else {
                node.setHasChildren(false);
                node.setChildren(null);
            }
            nodes.add(node);
        }
        System.out.println(nodes);
        return nodes;
    }

    @SuppressWarnings("resource")
    public static List<Node> getResourcesByParentId(String parentUUID) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ResourceMapper resMapper = context.getBean(ResourceMapper.class);
        List<Resource> list = resMapper.findByParentUUID(parentUUID);
        List<Node> nodes = new ArrayList<Node>();
        for (Resource res : list) {
            List<Resource> children = resMapper.findByParentUUID(res.getMenu_id());
            System.out.println("===========\n" + children.size() + "\n===========");
            Node node = new Node();
            node.setId(res.getMenu_id());
            node.setName(res.getDir_name());
            node.setPid(res.getParent_id());
            if (children.size() != 0) {
                node.setHasChildren(true);
                List<Node> byParentUUID = getResourcesByParentId(res.getMenu_id());
                node.setChildren(byParentUUID);
            } else {
                node.setHasChildren(false);
                node.setChildren(null);
            }
            nodes.add(node);
        }
        System.out.println(nodes);
        return nodes;
    }
}
