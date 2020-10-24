package com.baizhi.entity;/*
 *@param
 *@return
 *@author
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ToString
@TableName("yx_video")
public class Video implements Serializable {
    public Video() {
    }

    //private static final long serialVersionUID=1L;
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String title;
    // @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String intro;
    // @Field(type = FieldType.Keyword)
    private String coverUrl;
    //@Field(type = FieldType.Keyword)
    private String videoUrl;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    // @JSONField(format="yyyy-MM-dd")
    // @Field(type = FieldType.Date)
    private Date createAt;
    // @Field(type = FieldType.Keyword)
    private String userId;
    // @Field(type = FieldType.Keyword)
    private String cid;
    // @Field(type = FieldType.Keyword)
    private String grpId;
    private Category category;


}
