package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import com.baizhi.entity.Category;
import com.baizhi.entity.Video;
import com.baizhi.feign.BookFeign;
import com.baizhi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Resource
    BookFeign bookFeign;

    @RequestMapping("queryByCategory")
    public String queryByCategory(HttpSession session) {
        List<Category> categories = categoryService.queryByTwoCategory();
        System.out.println(categories);
        session.setAttribute("categorys", categories);
        return "forward:/showCategoryNew.jsp";
    }

    @RequestMapping("queryByVideo")
    public String queryByVideo(String cateId, HttpSession session) {
        List<Video> videos = bookFeign.queryByVideo(cateId);
        session.setAttribute("videos", videos);
        return "showVideo";
    }
}
