package com.isoftstone.gdmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftstone.gdmt.dao.RoleDao;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> findAll() {
        return roleDao.selectByExample(null);
    }

    public Pagination<Role> getRoles(Pagination<Role> page) {
        return null;
    }

    public Role getRole(String uuid) {
        return roleDao.selectByPrimaryKey(uuid);
    }

    public List<String> getResources(String roleId) {
        return null;
    }

    public int linkResource(String roleId, String resources) {
        return 0;
    }

    public int insertRole(Role role) {
        return roleDao.insertSelective(role);
    }

    public int updateRole(Role role) {
        return roleDao.updateByPrimaryKeySelective(role);
    }

    public int removeRole(String id) {
        return roleDao.deleteByPrimaryKey(id);
    }

}
