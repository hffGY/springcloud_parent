package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @RequestMapping("queryByBook")
    public String queryByBook(String cateId) {
        return "Book服务：client3 8764" + cateId;
    }
}
