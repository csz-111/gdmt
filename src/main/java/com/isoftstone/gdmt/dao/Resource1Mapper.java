package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.Resource1;
import com.isoftstone.gdmt.model.Resource1Example;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Resource1Mapper {
    long countByExample(Resource1Example example);

    int deleteByExample(Resource1Example example);

    int deleteByPrimaryKey(String resUuid);

    int insert(Resource1 record);

    int insertSelective(Resource1 record);

    List<Resource1> selectByExample(Resource1Example example);

    Resource1 selectByPrimaryKey(String resUuid);

    int updateByExampleSelective(@Param("record") Resource1 record, @Param("example") Resource1Example example);

    int updateByExample(@Param("record") Resource1 record, @Param("example") Resource1Example example);

    int updateByPrimaryKeySelective(Resource1 record);

    int updateByPrimaryKey(Resource1 record);
}