package com.example.yagolxyz.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Data
public class CommentVo {
    private String name;
    private String comment;
    private Date createTime;
}
