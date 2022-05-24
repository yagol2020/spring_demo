package com.example.yagolxyz.controller;

import com.example.yagolxyz.entity.Blog;
import com.example.yagolxyz.entity.Category;
import com.example.yagolxyz.service.BlogService;
import com.example.yagolxyz.vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blogs")
    public List<BlogVo> get(Category category) {
        return blogService.listVoByCategory(category);
    }
}
