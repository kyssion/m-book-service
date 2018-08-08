package com.mBook.module;

import java.io.Serializable;

public class TestModule implements Serializable {
    private String name;
    private String age;

    public TestModule(){
        super();
    }

    public TestModule(String name, String age) {
        super();
        this.name=name;
        this.age=age;
    }

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
