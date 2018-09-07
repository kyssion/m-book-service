package com.mBook.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherHeaderModel extends HeaderModel {
    public static final OtherHeaderModel baseModel = new OtherHeaderModel();

    @JsonProperty("header")
    private OtherHeaderStatus headerStatus;
    public static class OtherHeaderStatus implements Cloneable {
        private static final OtherHeaderStatus baseStatus= new OtherHeaderStatus();
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
        public static OtherHeaderStatus getClone(){
            try {
                return (OtherHeaderModel.OtherHeaderStatus) baseStatus.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return new OtherHeaderStatus();
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
        this.headerStatus.setCode(code);
        this.headerStatus.setDesc(desc);
        this.setBody(body);
        this.setPages(page);
    }

    public static OtherHeaderModel getBaseModel() {
        return baseModel;
    }

    public OtherHeaderStatus getHeaderStatus() {
        return headerStatus;
    }

    public void setHeaderStatus(OtherHeaderStatus headerStatus) {
        this.headerStatus = headerStatus;
    }

    public static HeaderModel getOtherHeaderModel(int code, String desc, Object body, Page page) {
        OtherHeaderModel model = null;
        try {
            model = (OtherHeaderModel) baseModel.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        model=new OtherHeaderModel();
        model.setHeaderStatus(OtherHeaderStatus.getClone());
        model.getHeaderStatus().setInformation(code,desc);
        model.setBody(body);
        model.setPages(page);
        return model;
    }
}
