package com.example.yagolxyz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yagolxyz.entity.Log;
import com.example.yagolxyz.mapper.LogMapper;
import com.example.yagolxyz.service.LogService;
import org.springframework.stereotype.Service;

/**
 * @author yagol
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {
    
    @Override
    public boolean log(String message, String classInvoker, String methodInvoker) {
        Log log = new Log();
        log.setContent(message);
        log.setClassInvoker(classInvoker);
        log.setMethodInvoker(methodInvoker);
        return this.save(log);
    }
}
