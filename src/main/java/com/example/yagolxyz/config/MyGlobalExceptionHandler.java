package com.example.yagolxyz.config;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.example.yagolxyz.rest.RestResp;
import com.example.yagolxyz.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yagol
 * @date 2022/5/26
 */
@ControllerAdvice
@ResponseBody
public class MyGlobalExceptionHandler {
    @Autowired
    LogService logService;

    @ExceptionHandler(Exception.class)
    public RestResp handleException(Exception e) {
        logService.log(ExceptionUtil.getRootCauseMessage(e));
        return RestResp.fail(e.getMessage());
    }
}
