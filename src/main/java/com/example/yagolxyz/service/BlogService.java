package com.example.yagolxyz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yagolxyz.entity.Blog;
import com.example.yagolxyz.entity.Category;
import com.example.yagolxyz.vo.BlogVo;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
public interface BlogService extends IService<Blog> {
    List<BlogVo> listVoByCategory(Category category);
}
