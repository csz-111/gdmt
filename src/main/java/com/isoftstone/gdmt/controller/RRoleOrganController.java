package com.isoftstone.gdmt.controller;

import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.model.TbRRoleOrgan;
import com.isoftstone.gdmt.service.RRoleOrganService;
import com.isoftstone.gdmt.util.PageResult;
import com.isoftstone.gdmt.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/duty")
public class RRoleOrganController {

    @Autowired
    private RRoleOrganService rRoleOrganService;

    @RequestMapping("/findAllRole")
    public List<Role> findAllRole() {
        return rRoleOrganService.findAllRole();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbRRoleOrgan> findAll() {
        return rRoleOrganService.findAll();
    }


    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return rRoleOrganService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param rRoleOrgan
     * @return
     */
    @RequestMapping("/insert")
    public Result add(TbRRoleOrgan rRoleOrgan) {
        try {
            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            rRoleOrgan.setDutyid(uuid);
            rRoleOrganService.add(rRoleOrgan);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param rRoleOrgan
     * @return
     */
    @RequestMapping("/update")
    public Result update(TbRRoleOrgan rRoleOrgan) {
        try {
            rRoleOrganService.update(rRoleOrgan);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     *
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public TbRRoleOrgan findOne(String id) {
        return rRoleOrganService.findOne(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/remove")
    public Result delete(String id) {
        try {
            rRoleOrganService.delete(id);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param brand
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(TbRRoleOrgan rRoleOrgan, int pageNumber, int pageSize) {
        return rRoleOrganService.findPage(rRoleOrgan, pageNumber, pageSize);
    }

}

