package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.Organization;
import com.isoftstone.gdmt.model.OrganizationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrganizationDao {

    long countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(String organ_uuid);

    int insert(@Param("record") Organization record);

    int insertSelective(@Param("record") Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(String organ_uuid);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(@Param("record") Organization record);

    Organization findParent(String parent_uuid);

    List<Organization> findChildren(String organ_uuid);

    List<Organization> getOrgsByParentId(String parent_uuid);

    List<Organization> findPagination(@Param("pageNumber") int pageNumber, @Param("pageSize") int pageSize);

    List<Organization> findByParentUUID(String parentUUID);
}