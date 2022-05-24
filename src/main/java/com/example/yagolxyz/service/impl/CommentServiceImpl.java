package com.example.yagolxyz.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yagolxyz.entity.Comment;
import com.example.yagolxyz.mapper.CommentMapper;
import com.example.yagolxyz.service.CommentService;
import com.example.yagolxyz.vo.CommentVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
    @Override
    public List<CommentVo> listVoByBlogId(int blogId) {
        List<Comment> comments = list(new LambdaQueryWrapper<Comment>().eq(Comment::getBlogId, blogId));
        return BeanUtil.copyToList(comments, CommentVo.class);
    }
}
