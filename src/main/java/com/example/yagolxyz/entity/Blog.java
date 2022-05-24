package com.example.yagolxyz.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Blog extends BaseEntity {
    private String title;
    private String content;
    private Category category;
}
