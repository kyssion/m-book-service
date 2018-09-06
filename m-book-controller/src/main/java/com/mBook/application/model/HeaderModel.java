package com.mBook.application.model;

import com.mBook.application.status.HeaderStatus;

public class HeaderModel implements Cloneable{
    private HeaderStatus status;
    private Object body;
    private Page pages;
    public static final HeaderModel copyModel = new HeaderModel();
    public HeaderModel(){
        super();
    }

    public HeaderModel(HeaderStatus status){
        this(status,null);
    }
    public HeaderModel(HeaderStatus status,Object body){
        this(status,body,null);
    }
    public HeaderModel(HeaderStatus status,Object body,Page page){
        if(status==null){
            this.status=status;
            this.body=body;
            this.pages=page;
        }
    }

    public Object getBody() {
        return body;
    }

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

    public static HeaderModel getHeaderModel(HeaderStatus status, Object body,Page page) throws CloneNotSupportedException {
        HeaderModel model = (HeaderModel) copyModel.clone();
        model.setHeader(status);
        model.setBody(body);
        model.setPages(page);
        return model;
    }

    public static HeaderModel getOtherHeaderModel(int code,String desc,Object body,Page page) throws Exception {
        OtherHeaderModel otherHeaderModel = OtherHeaderModel.getOtherHeaderModel()
    }

}
