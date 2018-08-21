package com.mBook.application.code;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  HeaderStatus {
    OK("成功",200);
    private String desc;
    private int code;
    HeaderStatus(String desc,int code){
        this.desc = desc;
        this.code = code;
    }

    @JsonValue
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonValue
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
