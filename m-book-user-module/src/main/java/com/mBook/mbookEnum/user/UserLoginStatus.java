package com.mBook.mbookEnum.user;

public enum  UserLoginStatus {
    SUSSESS("登入成功",200),ERROR("未知错误",500),PASSWORD_ERROR("密码错误",501),
    NO_REGISTER("用户未注册或者密码错误",502);
    private String desc;
    private int code;
    UserLoginStatus(String desc,int code){
        this.desc=desc;
        this.code=code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
