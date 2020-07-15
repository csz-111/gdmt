package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.model.TbRRoleOrgan;
import com.isoftstone.gdmt.util.PageResult;

import java.util.List;

public interface RRoleOrganService {

    public List<Role> findAllRole();

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<TbRRoleOrgan> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(TbRRoleOrgan rRoleOrgan);


    /**
     * 修改
     */
    public void update(TbRRoleOrgan rRoleOrgan);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public TbRRoleOrgan findOne(String id);


    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(String id);

    /**
     * 分页
     *
     * @param pageNum  当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbRRoleOrgan rRoleOrgan, int pageNum, int pageSize);

}
