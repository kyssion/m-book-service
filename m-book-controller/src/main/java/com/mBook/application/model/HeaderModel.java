package com.mBook.application.model;

import com.mBook.application.status.HeaderStatus;

public class HeaderModel implements Cloneable {
    private HeaderStatus status;
    private Object body;
    private Page pages;
    public static final HeaderModel copyModel = new HeaderModel();

    public HeaderModel() {
        super();
    }

    public HeaderModel(HeaderStatus status) {
        this(status, null);
    }

    public HeaderModel(HeaderStatus status, Object body) {
        this(status, body, null);
    }

    public HeaderModel(HeaderStatus status, Object body, Page page) {
        if (status == null) {
            this.status = status;
            this.body = body;
            this.pages = page;
        }
    }

//    public Object getBody() {
//        return body;
//    }

    public void setBody(Object body) {
        this.body = body;
    }

    public HeaderStatus getHeader() {
        return status;
    }

    public void setHeader(HeaderStatus status) {
        this.status = status;
    }

    public Page getPages() {
        return pages;
    }

    public void setPages(Page pages) {
        this.pages = pages;
    }

    public static HeaderModel getHeaderModel(HeaderStatus status) {
        return getHeaderModel(status, null);
    }

    public static HeaderModel getHeaderModel(HeaderStatus status, Object body) {
        return getHeaderModel(status, body, null);
    }

    public static HeaderModel getHeaderModel(HeaderStatus status, Object body, Page page) {
        HeaderModel model = null;
        try {
            model = (HeaderModel) copyModel.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        model.setHeader(status);
        model.setBody(body);
        model.setPages(page);
        return model;
    }

    public static HeaderModel getHeaderModel(int code, String desc) {
        return OtherHeaderModel.getHeaderModel(code, desc, null);
    }

    public static HeaderModel getHeaderModel(int code, String desc, Object body)  {
        return OtherHeaderModel.getHeaderModel(code, desc, body, null);
    }

    public static HeaderModel getHeaderModel(int code, String desc, Object body, Page page) {
        HeaderModel otherHeaderModel = OtherHeaderModel.getOtherHeaderModel(code, desc, body, page);
        return otherHeaderModel;
    }

}
