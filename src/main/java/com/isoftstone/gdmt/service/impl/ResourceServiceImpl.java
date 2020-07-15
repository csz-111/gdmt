package com.isoftstone.gdmt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isoftstone.gdmt.dao.ResourceMapper;
import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Resource;
import com.isoftstone.gdmt.model.ResourceExample;
import com.isoftstone.gdmt.model.ResourceExample.Criteria;
import com.isoftstone.gdmt.service.ResourceService;
import com.isoftstone.gdmt.util.PageResult;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resMapper;

    @Override
    public List<Resource> finAll() {
        List<Resource> list = resMapper.selectByExample(null);
        for (Resource resource : list) {
            Resource res = resMapper.findUrlById(resource.getMenu_id());
            if (res != null) {
                resource.setParent(res.getParent());
            }
        }
        return list;
    }

    @Override
    public Resource findOne(String id) {
        Resource resource = resMapper.selectByPrimaryKey(id);
        Resource res = resMapper.findUrlById(resource.getMenu_id());
        if (res != null) {
            resource.setParent(res.getParent());
        }
        return resource;
    }

    @Override
    public void remove(String id) {
        resMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void insert(Resource res) {
        resMapper.insertSelective(res);

    }

    @Override
    public void update(Resource res) {
        resMapper.updateByPrimaryKey(res);

    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Resource> page = (Page<Resource>) resMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public PageResult findPage(Resource res, int page, int rows) {
        PageHelper.startPage(page, page);

        ResourceExample example = new ResourceExample();
        Criteria criteria = example.createCriteria();

        if (res != null) {
            if (res.getMenu_id() != null && res.getRes_uuid().length() > 0) {
            }
            if (res.getDir_code() != null && res.getDir_code().length() > 0) {
                criteria.andDirCodeLike("%" + res.getDir_code() + "%");
            }
            if (res.getDir_name() != null && res.getDir_name().length() > 0) {
                criteria.andDirNameLike("%" + res.getDir_name() + "%");
            }
            if (res.getDir_type() != null && res.getDir_type().length() > 0) {
                criteria.andDirTypeLike("%" + res.getDir_type() + "%");
            }
        }

        Page<Resource> page1 = (Page<Resource>) resMapper.selectByExample(example);
        return new PageResult(page1.getTotal(), page1.getResult());
    }

    @Override
    public Pagination<Resource> findPagination(int pageNumber, int pageSize) {
        int pageNum = pageNumber - 1;
        List<Resource> list = resMapper.findPagination(pageNum * 10, pageSize);
        for (Resource resource : list) {
            Resource res = resMapper.findUrlById(resource.getMenu_id());
            if (res != null) {
                resource.setParent(res.getParent());
            }
        }
        Pagination<Resource> pagination = new Pagination<Resource>();
        pagination.setRows(list);
        int total = (int) resMapper.countByExample(null);
        pagination.setTotal(total);
        pagination.setPageNumber(pageNumber);
        pagination.setPageSize(pageSize);
        System.out.println(pagination);
        return pagination;
    }

    @Override
    public List<Node> getResourcesByParentId(String parentUUID) {
        List<Resource> list = resMapper.findByParentUUID(parentUUID);
        List<Node> nodes = new ArrayList<Node>();
        for (Resource res : list) {
            List<Resource> children = resMapper.findByParentUUID(res.getMenu_id());
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
