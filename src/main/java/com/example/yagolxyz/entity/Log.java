package com.example.yagolxyz.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yagol
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Log extends BaseEntity {
    String content;
}
