package com.isoftstone.gdmt.service;

import java.util.List;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.User;
import com.isoftstone.gdmt.util.PageResult;

public interface UserService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<User> findAll();


    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(Integer pageNum, Integer pageSize);


    /**
     * 增加
     */
    public void add(User user);


    /**
     * 修改
     */
    public void update(User user);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public User findOne(String uuid);


    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(String[] ids);

    /**
     * 分页查询
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public Pagination<User> findPagination(Integer pageNumber, Integer pageSize);


    public PageResult findPage(User user, Integer page, Integer rows);

    /**
     * 删除
     *
     * @param id
     */
    public void remove(String id);


}
