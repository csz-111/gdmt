package com.isoftstone.gdmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isoftstone.gdmt.dao.Resource1Mapper;
import com.isoftstone.gdmt.model.Resource1;
import com.isoftstone.gdmt.model.ResourceExample;
import com.isoftstone.gdmt.model.ResourceExample.Criteria;
import com.isoftstone.gdmt.service.Resource1Service;
import com.isoftstone.gdmt.service.ResourceService;
import com.isoftstone.gdmt.util.PageResult;

@Service
public class Resource1ServiceImpl implements Resource1Service {

    @Autowired
    private Resource1Mapper resMapper;

    @Override
    public List<Resource1> finAll() {

        return resMapper.selectByExample(null);
    }

    @Override
    public void remove(String id) {
        resMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void insert(Resource1 res) {
        resMapper.insert(res);

    }

    @Override
    public void update(Resource1 res) {
        resMapper.updateByPrimaryKey(res);

    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Resource1> page = (Page<Resource1>) resMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public Resource1 findOne(String id) {
        System.out.println("Service uuid:" + id);
        Resource1 resource = resMapper.selectByPrimaryKey(id);
        System.out.println("Service Resource:" + resource);
        return resource;
    }

}
