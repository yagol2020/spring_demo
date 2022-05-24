package com.example.yagolxyz.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yagolxyz.entity.Blog;
import com.example.yagolxyz.entity.Category;
import com.example.yagolxyz.mapper.BlogMapper;
import com.example.yagolxyz.service.BlogService;
import com.example.yagolxyz.service.CommentService;
import com.example.yagolxyz.vo.BlogVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    CommentService commentService;

    @Override
    public List<BlogVo> listVoByCategory(Category category) {
        List<Blog> blogs = list(new LambdaQueryWrapper<Blog>().eq(Blog::getCategory, category));
        List<BlogVo> blogVos = BeanUtil.copyToList(blogs, BlogVo.class);
        for (BlogVo blogVo : blogVos) {
            blogVo.setComments(commentService.listVoByBlogId(blogVo.getId()));
        }
        return blogVos;
    }
}
