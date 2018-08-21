package com.mBook.application.model;

import com.mBook.application.code.HeaderStatus;

public class HeaderModel {
    private HeaderStatus header;
    private Object body;

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
