package com.example.yagolxyz.entity;

import com.example.yagolxyz.YagolxyzApplicationTests;
import com.example.yagolxyz.mapper.LogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogTest extends YagolxyzApplicationTests {
    @Autowired
    LogMapper logMapper;

    @Test
    void testLogBaseMapper() {
        Log log = new Log();
        log.setClassInvoker(getClass().getName());
        log.setMethodInvoker(getClass().getName());
        log.setContent("hi");
        logMapper.insert(log);
        List<Log> logs = logMapper.selectList(null);
        logs.forEach(System.out::println);
    }

    @Test
    void testUpdate() {
        Log log = logMapper.selectById(1);
        log.setContent("hi, update");
        logMapper.updateById(log);
    }
}
