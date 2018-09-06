package com.mBook.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherHeaderModel extends HeaderModel {
    private static final OtherHeaderModel baseModel = new OtherHeaderModel();
    private static final OtherHeaderStatus baseStatus = new OtherHeaderStatus();
    @JsonProperty("header")
    private OtherHeaderStatus OtherHeaderStatus;

    private static class OtherHeaderStatus implements Cloneable {
        private int code;
        private String desc;

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

        public void setInformation(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public OtherHeaderStatus clone() {
            return this.clone();
        }
    }

    public OtherHeaderModel() {
        super();
    }

    public OtherHeaderModel(int code, String desc) {
        this(code, desc, null);
    }

    public OtherHeaderModel(int code, String desc, Object body) {
        this(code, desc, body, null);
    }

    public OtherHeaderModel(int code, String desc, Object body, Page page) {
        this.setHeader(null);
        this.OtherHeaderStatus.setCode(code);
        this.OtherHeaderStatus.setDesc(desc);
        this.setBody(body);
        this.setPages(page);
    }

    public static OtherHeaderModel getBaseModel() {
        return baseModel;
    }

    public OtherHeaderModel.OtherHeaderStatus getOtherHeaderStatus() {
        return OtherHeaderStatus;
    }

    public void setOtherHeaderStatus(OtherHeaderModel.OtherHeaderStatus otherHeaderStatus) {
        OtherHeaderStatus = otherHeaderStatus;
    }

    public static HeaderModel getOtherHeaderModel(int code, String desc, Object body, Page page) throws Exception {
        OtherHeaderModel model = (OtherHeaderModel) baseModel.clone();
        model.setOtherHeaderStatus();
        model.getOtherHeaderStatus().setInformation(code,desc);
        model.setBody(body);
        model.setPages(page);
        return model;
    }
}
