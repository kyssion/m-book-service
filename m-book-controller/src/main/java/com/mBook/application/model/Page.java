package com.mBook.application.model;

public class Page {
    private int page;
    private int size;
    private int allPage;
    public Page(){
        super();
    }
    public Page(int page,int size,int allPage){
        this.page=page;
        this.size=size;
        this.allPage=allPage;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAllPage() {
        return allPage;
    }

    public void setAllPage(int allPage) {
        this.allPage = allPage;
    }
}
