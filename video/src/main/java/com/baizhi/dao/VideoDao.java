package com.baizhi.dao;

import com.baizhi.entity.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoDao {
    List<Video> queryByVideo(@Param("cId") String cateId);
}
