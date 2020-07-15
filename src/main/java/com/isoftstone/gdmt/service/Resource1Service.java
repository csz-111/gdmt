package com.isoftstone.gdmt.service;

import java.util.List;

import com.isoftstone.gdmt.model.Resource1;
import com.isoftstone.gdmt.util.PageResult;

public interface Resource1Service {

    List<Resource1> finAll();

    void remove(String id);

    PageResult findPage(int pageNum, int pageSize);

    void insert(Resource1 res);

    void update(Resource1 res);

    Resource1 findOne(String id);

}
