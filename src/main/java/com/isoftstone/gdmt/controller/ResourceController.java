package com.isoftstone.gdmt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Resource;
import com.isoftstone.gdmt.service.ResourceService;
import com.isoftstone.gdmt.util.PageResult;
import com.isoftstone.gdmt.util.Result;

@Controller
@RequestMapping("/res")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @RequestMapping("/findPagination")
    @ResponseBody
    public Pagination<Resource> findPagination(int pageNumber, int pageSize) {
        return resourceService.findPagination(pageNumber, pageSize);
    }
    /*
     * @RequestMapping("/getRes")
     *
     * @ResponseBody public Resource getRes(String id) {
     * System.out.println("Controller uuid:\n"+id); return
     * resourceService.findOne(id); }
     */

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return resourceService.findPage(page, rows);
    }

    @RequestMapping("/getRes")
    @ResponseBody
    public List<Resource> getRes() {
        return resourceService.finAll();
    }

    @RequestMapping("/getResource")
    @ResponseBody
    public Resource getResource(String uuid) {
        return resourceService.findOne(uuid);
    }

    @RequestMapping("/getResourcesByParentId")
    @ResponseBody
    public Node getResourcesByParentId(@RequestParam String parentId) {
        List<Node> orgs = this.resourceService.getResourcesByParentId(parentId);
        return new Node("root", "Root", null, true, orgs);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(Resource res) {
        try {
            String mid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            res.setMenu_id(mid);
            resourceService.insert(res);
            return new Result(true, "添加成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败!");
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(Resource res) {
        try {
            resourceService.update(res);
            return new Result(true, "修改成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败!");
        }
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Result remove(String id) {
        try {
            resourceService.remove(id);
            return new Result(true, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败!");
        }
    }

}
