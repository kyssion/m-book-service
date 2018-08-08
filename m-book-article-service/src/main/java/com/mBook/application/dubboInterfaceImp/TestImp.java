package com.mBook.application.dubboInterfaceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.mBook.articleInterface.TestInterface;
import com.mBook.module.TestModule;
import org.springframework.stereotype.Component;

@Component
@Service
public class TestImp implements TestInterface {
    @Override
    public TestModule testMethod(String name, String age) {
        System.out.println("服务端接收的信息"+name+"|"+age);
        return new TestModule(name,age);
    }
}
