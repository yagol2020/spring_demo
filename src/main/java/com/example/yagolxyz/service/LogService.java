package com.example.yagolxyz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yagolxyz.entity.Log;
import org.springframework.stereotype.Service;

@Service
public interface LogService extends IService<Log> {
    boolean log(String message,String classInvoker,String methodInvoker);
}
