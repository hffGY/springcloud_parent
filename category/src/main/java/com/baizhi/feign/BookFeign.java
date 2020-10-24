package com.baizhi.feign;

import com.baizhi.entity.Video;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "VIDEO")
public interface BookFeign {
    @RequestMapping("/video/queryByVideo")
    public List<Video> queryByVideo(@RequestParam("cateId") String cateId);
}
