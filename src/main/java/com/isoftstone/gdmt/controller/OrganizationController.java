package com.isoftstone.gdmt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.Organization;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.service.OrganizationService;
import com.isoftstone.gdmt.util.Result;
import com.isoftstone.gdmt.model.Node;

@Controller
@RequestMapping("/org")
public class OrganizationController {

    @Autowired
    private OrganizationService organService;

    @RequestMapping("/getOrgs")
    @ResponseBody
    public List<Organization> getOrgs() {
        return organService.findAll();
    }

    @RequestMapping("/getOrg")
    @ResponseBody
    public Organization getOrg(String id) {
        return organService.findOne(id);
    }

    /***
     * 分页
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping("/findPagination")
    @ResponseBody
    public Pagination<Organization> findPagination(int pageNumber, int pageSize) {
        return organService.findPagination(pageNumber, pageSize);
    }

    @RequestMapping("/getOrgsByParentId")
    @ResponseBody
    public Node getOrganizationsByParentUUID(@RequestParam String parentUUID) {
        List<Node> orgs = organService.getOrganizationsByParentUUID(parentUUID);
        return new Node("-1", "国电集团", null, true, orgs);
    }

    @RequestMapping("/getOutRootByParentId")
    @ResponseBody
    public Node getOutRootByParentUUID(@RequestParam String parentUUID) {
        List<Node> orgs = this.organService.getOrganizationsByParentUUID(parentUUID);
        return new Node("outroot", "外部组织", null, true, orgs);
    }

    /**
     * 增加
     *
     * @param organ
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(Organization organ) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        organ.setOrgan_uuid(uuid);
        try {
            organService.insert(organ);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param organ
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public Result update(Organization organ) {
        try {
            organService.update(organ);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/remove")
    @ResponseBody
    public Result remove(String id) {
        try {
            organService.remove(id);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

}
