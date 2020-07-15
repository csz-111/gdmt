package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.TbRRoleOrgan;
import com.isoftstone.gdmt.model.TbRRoleOrganExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RRoleOrganDao {
    long countByExample(TbRRoleOrganExample example);

    int deleteByExample(TbRRoleOrganExample example);

    int deleteByPrimaryKey(String dutyid);

    int insert(TbRRoleOrgan record);

    int insertSelective(TbRRoleOrgan record);

    List<TbRRoleOrgan> selectByExample(TbRRoleOrganExample example);

    List<TbRRoleOrgan> selectAll();

    TbRRoleOrgan selectByPrimaryKey(String dutyid);

    int updateByExampleSelective(@Param("record") TbRRoleOrgan record, @Param("example") TbRRoleOrganExample example);

    int updateByExample(@Param("record") TbRRoleOrgan record, @Param("example") TbRRoleOrganExample example);

    int updateByPrimaryKeySelective(TbRRoleOrgan record);

    int updateByPrimaryKey(TbRRoleOrgan record);
}
