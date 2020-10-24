package com.baizhi.controller;/*
 *@param
 *@return
 *@author
 */

import com.baizhi.entity.Video;
import com.baizhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("queryByVideo")
    @ResponseBody
    public List<Video> queryByVideo(String cateId) {
        List<Video> videos = videoService.queryByVideo(cateId);
        return videos;
    }
}
