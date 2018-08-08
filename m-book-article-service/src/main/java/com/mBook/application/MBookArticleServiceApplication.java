package com.mBook.application;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@DubboComponentScan("com.mBook.application.dubboInterfaceImp")
public class MBookArticleServiceApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(MBookArticleServiceApplication.class);
        System.in.read();
    }
}