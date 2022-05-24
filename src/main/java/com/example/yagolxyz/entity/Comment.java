package com.example.yagolxyz.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yagol
 * @date 2022/5/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Comment extends BaseEntity {
    private String name;
    private String comment;
    private String email;
    private String url;
    private int blogId;
}
