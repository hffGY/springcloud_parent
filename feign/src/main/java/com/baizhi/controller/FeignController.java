package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import com.baizhi.feign.BookFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Resource
    BookFeign bookFeign;

    @RequestMapping("queryByFeign")
    public String queryByFeign(String id) {
        String str = bookFeign.queryByFeign(id);
        return "feign 8765" + str;
    }
}
