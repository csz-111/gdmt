package com.isoftstone.gdmt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.isoftstone.gdmt.model.User;
import com.isoftstone.gdmt.model.UserExample;

public interface UserDao {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userUuid);

    int insert(@Param("record") User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findParent(String parent_uuid);

    List<User> findchildren(String user_uuid);

    User findByPID(String user_uuid);

    List<User> getUsersByParentId(String parent_uuid);

    List<User> findPagination(@Param("pageNumber") Integer pageNumber, @Param("pageSize") Integer pageSize);
}
