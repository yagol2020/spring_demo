package com.example.yagolxyz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * @author yagol
 */
@Data
public class BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    Integer id;
    Date createTime;
    @TableField(update = "now()")
    Date updateTime;
}
