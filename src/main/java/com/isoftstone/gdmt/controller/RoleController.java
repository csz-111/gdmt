package com.isoftstone.gdmt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/getRoles")
    @ResponseBody
    public Pagination<Role> getRoles(@ModelAttribute Pagination<Role> page) {
        return this.roleService.getRoles(page);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Role> findAll() {
        return this.roleService.findAll();
    }

    @RequestMapping(value = "/getRoles2")
    @ResponseBody
    public List<Role> getRoles() {
        return this.roleService.getRoles(new Pagination<Role>(1, 1000)).getRows();
    }

    @RequestMapping(value = "/getRole")
    @ResponseBody
    public Role getRole(@RequestParam String uuid) {
        return this.roleService.getRole(uuid);
    }

    @RequestMapping(value = "/getResources")
    @ResponseBody
    public List<String> getResources(String roleId) {
        return this.roleService.getResources(roleId);
    }

    @RequestMapping(value = "/linkResource")
    @ResponseBody
    public int linkResource(@RequestParam String roleId, @RequestParam String resources) {
        return this.roleService.linkResource(roleId, resources);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insertRole(@ModelAttribute Role Role) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        Role.setRole_uuid(uuid);
        return this.roleService.insertRole(Role);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public int updateRole(@ModelAttribute Role Role) {
        return this.roleService.updateRole(Role);
    }

    @RequestMapping(value = "/remove")
    @ResponseBody
    public int removeRole(@RequestParam String id) {
        return this.roleService.removeRole(id);
    }
}