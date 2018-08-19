package com.mBook.application.dubboInterfaceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.registry.zookeeper.ZookeeperRegistry;
import com.mBook.articleInterface.TestInterface;
import com.mBook.module.TestModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Service
public class TestImp implements TestInterface {
    Logger logger = LoggerFactory.getLogger(TestImp.class);
    @Override
    public TestModule testMethod(String name, String age) {
        return new TestModule(name,age);
    }
}
