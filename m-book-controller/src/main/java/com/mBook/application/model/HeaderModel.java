package com.mBook.application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mBook.application.status.HeaderStatus;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderModel implements Cloneable {
    private HeaderStatus header;
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
            this.header = status;
            this.body = body;
            this.pages = page;
        }
    }

    public Object getBody() {
        return body;
    }

    public static HeaderModel getCopyModel() {
        return copyModel;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public HeaderStatus getHeader() {
        return header;
    }

    public void setHeader(HeaderStatus status) {
        this.header = status;
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
