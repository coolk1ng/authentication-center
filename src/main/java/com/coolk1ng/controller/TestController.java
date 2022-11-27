package com.coolk1ng.controller;

import com.coolk1ng.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author coolk1ng
 * @since 2022/11/27 20:12
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping(value = "/testCount")
    public Integer testCount() {
        return testMapper.testCount();
    }
}
