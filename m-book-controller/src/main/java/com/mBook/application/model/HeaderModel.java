package com.mBook.application.model;

import com.mBook.application.status.HeaderStatus;

public class HeaderModel {
    private HeaderStatus header;
    private Object body;

    public HeaderModel(){
        super();
    }
    public HeaderModel(HeaderStatus status,Object body){
        this.header = status;
        this.body = body;
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
}
