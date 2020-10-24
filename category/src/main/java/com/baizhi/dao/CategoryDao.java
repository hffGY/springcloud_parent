package com.baizhi.dao;

import com.baizhi.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDao {
    List<Category> queryByTwoCategory(@Param("level") String level);
}
