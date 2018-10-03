package com.mBook.application;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@DubboComponentScan("com.mBook.application.articleInterfaceImp")
public class MBookArticleServiceApplication {
    public final static Logger logger = LoggerFactory.getLogger(MBookArticleServiceApplication.class);
    public static void main(String[] args) throws IOException {
        SpringApplication.run(MBookArticleServiceApplication.class);
        Test test = new Test();
        test.setAge("123");
        test.setName("我恶昂");
        logger.info("速度非所担{}负的死死{}的发送的{}繁琐的",1,2,test);
        System.in.read();
    }
    static class Test{
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}