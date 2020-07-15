package com.isoftstone.gdmt.service.impl;

import com.isoftstone.gdmt.dao.NewsMapper;
import com.isoftstone.gdmt.model.News;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class NewsServiceImpl implements NewsService {


    @Autowired
    private NewsMapper newsMapper;

    @Override
    public Pagination<News> findPagination(int pageNumber, int pageSize) {
        int pageNum = pageNumber - 1;
        List<News> list = newsMapper.findPagination(pageNum * 10, pageSize);

        Pagination<News> pagination = new Pagination<News>();
        pagination.setRows(list);
        int total = (int) newsMapper.countByExample(null);
        pagination.setTotal(total);
        pagination.setPageNumber(pageNumber);
        pagination.setPageSize(pageSize);
        System.out.println(pagination);
        return pagination;
    }

    @Override
    public void insert(News news) {
        news.setOperatetime(new Date());
        newsMapper.insert(news);
    }

    @Override
    public void remove(String id) {
        newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public News findOne(String id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(News news) {
        newsMapper.updateByPrimaryKeySelective(news);
    }
}
