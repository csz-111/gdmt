package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.News;
import com.isoftstone.gdmt.model.Pagination;

public interface NewsService {
    Pagination<News> findPagination(int pageNumber, int pageSize);

    void insert(News news);

    void remove(String id);

    News findOne(String id);

    void update(News news);
}
