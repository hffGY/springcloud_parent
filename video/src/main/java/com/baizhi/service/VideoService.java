package com.baizhi.service;

import com.baizhi.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> queryByVideo(String cateId);
}
