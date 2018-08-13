package com.mBook.application;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.mBook.application")
public class MBookControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MBookControllerApplication.class);
    }
}
