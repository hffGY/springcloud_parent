package com.baizhi.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//声明调用的服务实例名
@FeignClient(name = "EUREKA-CLIENT2")
public interface BookFeign {
    @RequestMapping("/books/queryByFeign")
    //返回值和参数要与调用的方法一致
    public String queryByFeign(@RequestParam("id") String id);
}
