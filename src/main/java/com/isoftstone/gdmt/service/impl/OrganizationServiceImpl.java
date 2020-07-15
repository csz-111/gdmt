package com.isoftstone.gdmt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftstone.gdmt.dao.OrganizationDao;
import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Organization;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDao organDao;

    @Override
    public List<Organization> findAll() {
        List<Organization> list = organDao.selectByExample(null);
        for (Organization organization : list) {
            Organization parent = organDao.findParent(organization.getParent_uuid());
            organization.setParent(parent);
            List<Organization> children = organDao.findChildren(organization.getOrgan_uuid());
            organization.setChildren(children);
        }
        return list;
    }

    @Override
    public Organization findOne(String id) {
        Organization organization = organDao.selectByPrimaryKey(id);
        Organization parent = organDao.findParent(organization.getParent_uuid());
        organization.setParent(parent);
        return organization;
    }

    @Override
    public void insert(Organization organ) {
        organDao.insert(organ);
    }

    @Override
    public void update(Organization organ) {
        organDao.updateByPrimaryKeySelective(organ);
    }

    @Override
    public void remove(String id) {
        organDao.deleteByPrimaryKey(id);
    }

    @Override
    public Pagination<Organization> findPagination(int pageNumber, int pageSize) {
        int pageNum = pageNumber - 1;
        List<Organization> list = organDao.findPagination(pageNum * 10, pageSize);
        for (Organization organization : list) {
            Organization parent = organDao.findParent(organization.getParent_uuid());
            organization.setParent(parent);
            List<Organization> children = organDao.findChildren(organization.getOrgan_uuid());
            organization.setChildren(children);
        }
        Pagination<Organization> pagination = new Pagination<Organization>();
        pagination.setRows(list);
        int total = (int) organDao.countByExample(null);
        pagination.setTotal(total);
        pagination.setPageNumber(pageNumber);
        pagination.setPageSize(pageSize);
        System.out.println(pagination);
        return pagination;
    }

    @Override
    public List<Node> getOrganizationsByParentUUID(String parentUUID) {
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

}
