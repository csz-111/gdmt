package com.isoftstone.gdmt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.User;
import com.isoftstone.gdmt.service.UserService;
import com.isoftstone.gdmt.util.PageResult;
import com.isoftstone.gdmt.util.Result;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 改动分页查询
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping("/findPagination")
    @ResponseBody
    public Pagination<User> findPagination(Integer pageNumber, Integer pageSize) {
        return userService.findPagination(pageNumber, pageSize);
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult findPage(Integer page, Integer rows) {
        return userService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param user
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Result add(User user) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        user.setUser_uuid(uuid);
        try {
            userService.add(user);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public Result update(User user) {
        try {
            userService.update(user);
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
            userService.remove(id);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 获取实体
     *
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    @ResponseBody
    public User findOne(String uuid) {
        return userService.findOne(uuid);

    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String[] ids) {
        try {
            userService.delete(ids);
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
    @ResponseBody
    public PageResult search(User user, Integer page, Integer rows) {
        return userService.findPage(user, page, rows);
    }

}
