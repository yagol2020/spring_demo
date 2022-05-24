package com.example.yagolxyz.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Data
public class BlogVo {
    private int id;
    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private List<CommentVo> comments;
}
