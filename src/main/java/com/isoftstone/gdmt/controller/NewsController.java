package com.isoftstone.gdmt.controller;

import com.isoftstone.gdmt.model.News;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.service.NewsService;
import com.isoftstone.gdmt.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@SuppressWarnings("Duplicates")
@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/findPagination")
    @ResponseBody
    public Pagination<News> findPagination(int pageNumber, int pageSize) {
        return newsService.findPagination(pageNumber, pageSize);
    }


    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(News news) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        news.setId(uuid);
        try {
            newsService.insert(news);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }


    @RequestMapping("/remove")
    @ResponseBody
    public Result remove(String id) {
        try {
            newsService.remove(id);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/seeNews")
    public String seeNews(String id, Model model) {
        News news = newsService.findOne(id);
        model.addAttribute("news", news);
        return "detail/detail";
    }

    @RequestMapping("/getNews")
    @ResponseBody
    public News getNews(String id) {
        return newsService.findOne(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(News news) {
        try {
            newsService.update(news);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
}
