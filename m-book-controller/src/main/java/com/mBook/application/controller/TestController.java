package com.mBook.application.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mBook.articleInterface.TestInterface;
import com.mBook.module.TestModule;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    TestInterface testInterface;

    @RequestMapping("ttt/test")
    public TestModule test(){
        TestModule testModule= testInterface.testMethod("kys","123");
        return testModule;
    }
}
