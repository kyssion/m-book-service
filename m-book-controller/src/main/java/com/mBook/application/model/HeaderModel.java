package com.mBook.application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mBook.application.status.HeaderStatus;

import java.io.Serializable;

/**
 * null 不显示
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderModel implements Cloneable, Serializable {
    private HeaderStatus header;
    private Object body;
    public static final HeaderModel copyModel = new HeaderModel();
    public HeaderModel(){
        super();
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public HeaderStatus getHeader() {
        return header;
    }

    public void setHeader(HeaderStatus header) {
        this.header = header;
    }

    public static HeaderModel createHeaderModel(HeaderStatus status,Object body) throws CloneNotSupportedException {
        HeaderModel model = (HeaderModel) copyModel.clone();
        model.setHeader(status);
        model.setBody(body);
        return model;
    }
}
