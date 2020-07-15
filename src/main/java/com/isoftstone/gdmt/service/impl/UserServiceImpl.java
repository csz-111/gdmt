package com.isoftstone.gdmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isoftstone.gdmt.dao.UserDao;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.User;
import com.isoftstone.gdmt.service.UserService;
import com.isoftstone.gdmt.util.PageResult;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return userDao.selectByExample(null);
    }

    @Override
    public PageResult findPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> page = (Page<User>) userDao.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(User user) {
        userDao.insertSelective(user);

    }

    @Override
    public void update(User user) {
        System.out.println("============\n" + user + "\n===============");
        userDao.updateByPrimaryKeySelective(user);

    }

    @Override
    public User findOne(String uuid) {
        System.out.println("Service uuid:" + uuid);
        User user = userDao.selectByPrimaryKey(uuid);
        System.out.println("Service organization:" + user);
        return user;
    }

    @Override
    public void delete(String[] ids) {
        for (String id : ids) {
            userDao.deleteByPrimaryKey(id);
        }

    }

    @Override
    public Pagination<User> findPagination(Integer pageNumber, Integer pageSize) {
        int pageNum = pageNumber - 1;
        List<User> list = userDao.findPagination(pageNum * 10, pageSize);
//		System.out.println(list);
        Pagination<User> pagination = new Pagination<User>();
        pagination.setRows(list);
        int total = (int) userDao.countByExample(null);
        pagination.setTotal(total);
        pagination.setPageNumber(pageNumber);
        pagination.setPageSize(pageSize);
        System.out.println(pagination);
        return pagination;

    }

    @Override
    public PageResult findPage(User user, Integer page, Integer rows) {

        return null;
    }

    @Override
    public void remove(String id) {
        userDao.deleteByPrimaryKey(id);

    }

}
