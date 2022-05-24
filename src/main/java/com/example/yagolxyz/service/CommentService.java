package com.example.yagolxyz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yagolxyz.entity.Comment;
import com.example.yagolxyz.vo.CommentVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Service
public interface CommentService extends IService<Comment> {

    List<CommentVo> listVoByBlogId(int blogId);
}
