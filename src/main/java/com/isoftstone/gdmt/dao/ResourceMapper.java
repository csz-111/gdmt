package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.Resource;
import com.isoftstone.gdmt.model.ResourceExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    long countByExample(ResourceExample example);

    int deleteByExample(ResourceExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(Resource record);

    int insertSelective(Resource record);

    List<Resource> selectByExample(ResourceExample example);

    Resource selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    List<Resource> findUrl();

    Resource findUrlById(String id);

    List<Resource> findPagination(@Param("pageNumber") int pageNumber, @Param("pageSize") int pageSize);

    List<Resource> findByPID(String parent_uuid);

    List<Resource> findByParentUUID(String parentUUID);
}