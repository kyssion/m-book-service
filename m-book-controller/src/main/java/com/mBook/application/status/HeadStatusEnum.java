package com.mBook.application.status;

public enum HeadStatusEnum {
    UNKNOWN_ERROR(10000, "未知异常"),
    SUCCESSFUL(10001, "请求成功"),
    FAILURE_SERVICE_ERROR(10002, "数据请求失败，后端异常"),
    FAILURE_PARAMETER_ERROR(10003, "请求失败，传入数据异常");
    private String desc;
    private int code;

    HeadStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
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

    public HeadStatusEnum getStatusByCode(int code) {
        for (HeadStatusEnum status : values()) {
            if (code == status.getCode()) {
                return status;
            }
        }
        return UNKNOWN_ERROR;
    }

}
