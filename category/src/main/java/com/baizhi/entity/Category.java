package com.baizhi.entity;/*
 *@param
 *@return
 *@author
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("yx_category")
public class Category implements Serializable {
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    private String name;
    private Character level;
    private String pId;
    @TableField(exist = false)
    private Category son;
}
