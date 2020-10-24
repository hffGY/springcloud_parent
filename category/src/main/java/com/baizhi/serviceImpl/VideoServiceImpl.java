package com.baizhi.serviceImpl;/*
 *@param
 *@return
 *@author
 */

import com.baizhi.dao.VideoDao;
import com.baizhi.entity.Video;
import com.baizhi.service.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class VideoServiceImpl implements VideoService {
    @Resource
    VideoDao videoDao;

    @Override
    public List<Video> queryByVideo(String cateId) {
        return videoDao.queryByVideo(cateId);
    }
}
