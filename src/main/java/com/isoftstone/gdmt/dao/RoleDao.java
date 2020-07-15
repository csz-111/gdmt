package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.model.RoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoleDao {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String roleUuid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String roleUuid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}