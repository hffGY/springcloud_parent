package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    RestTemplate restTemplate;

    /* @Resource
     LoadBalancerClient loadBalancerClient;*/
    @RequestMapping("queryCateName")
    public String queryCateName(String cateName) {
        //ServiceInstance choose = loadBalancerClient.choose("EUREKA-CLIENT2");
        //地址
        //System.out.println(choose.getUri());
        //IP
        // System.out.println(choose.getHost());
        //端口
        //System.out.println(choose.getPort());
        //微服务实例名字
        //System.out.println(choose.getServiceId());
        //从前端传递一个类别名称
        //根据类别名称查询类别信息
        //调用图书服务根据类别id查询图书的功能
        System.out.println(cateName);
        //HttpClient httpClient
        String url = "http://eureka-client2:8763/book/queryByBook?cateId=" + cateName;
        //发送http请求 参数:http请求路径，响应类型
        String forObject = restTemplate.getForObject(url, String.class);
        return "类别服务：client1 8762" + forObject;
    }
}
