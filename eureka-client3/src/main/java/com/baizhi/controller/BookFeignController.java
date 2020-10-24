package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookFeignController {
    @RequestMapping("queryByFeign")
    public String queryByFeign(String id) {
        return "图书服务 8764" + id;
    }
}
