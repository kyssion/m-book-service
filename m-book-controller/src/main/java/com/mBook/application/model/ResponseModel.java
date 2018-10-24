package com.mBook.application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mBook.application.status.HeaderStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ResponseModel implements Cloneable {

    private HeaderStatus header;

    private Object body;

    private Page pages;

    public static final ResponseModel copyModel = new ResponseModel();

    public ResponseModel() {
        super();
    }

    public ResponseModel(HeaderStatus status) {
        this(status, null);
    }

    public ResponseModel(HeaderStatus status, Object body) {
        this(status, body, null);
    }

    public ResponseModel(HeaderStatus status, Object body, Page page) {
        if (status == null) {
            this.header = status;
            this.body = body;
            this.pages = page;
        }
    }

    public Object getBody() {
        return body;
    }

    public static ResponseModel getCopyModel() {
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

    public static ResponseModel getResponseModel(HeaderStatus status) {
        return getResponseModel(status, null);
    }

    public static ResponseModel getResponseModel(HeaderStatus status, Object body) {
        return getResponseModel(status, body, null);
    }

    public static ResponseModel getResponseModel(HeaderStatus status, Object body, Page page) {
        ResponseModel model = null;
        try {
            model = (ResponseModel) copyModel.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        model.setHeader(status);
        model.setBody(body);
        model.setPages(page);
        return model;
    }

    public static ResponseModel getResponseModel(int code, String desc) {
        return OtherResponseModel.getResponseModel(code, desc, null);
    }

    public static ResponseModel getResponseModel(int code, String desc, Object body) {
        return OtherResponseModel.getResponseModel(code, desc, body, null);
    }

    public static ResponseModel getResponseModel(int code, String desc, Object body, Page page) {
        ResponseModel otherResponseModel = OtherResponseModel.getOtherResponseModel(code, desc, body, page);
        return otherResponseModel;
    }

}
class He{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
