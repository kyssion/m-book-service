package com.mBook.module;


import com.mBook.mBookEnum.article.ArticleTypeEnum;

import java.io.Serializable;

public class ArticleInformationBean implements Serializable {
    private String articleName;
    private long addTime;
    private String articleTheme;
    private String articleFrom;//来源如果是用户自己编写的将会是用户的名称
    private ArticleTypeEnum fromType;
    private String articleClassification;//文章分类
    private String url;//文章url地址 markdown格式
    private String customStyle;//自定义样式
    private String articleImg;//文章地址url
    private String articleIntroduction;//文章简介

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    public String getArticleTheme() {
        return articleTheme;
    }

    public void setArticleTheme(String articleTheme) {
        this.articleTheme = articleTheme;
    }

    public String getArticleFrom() {
        return articleFrom;
    }

    public void setArticleFrom(String articleFrom) {
        this.articleFrom = articleFrom;
    }

    public ArticleTypeEnum getFromType() {
        return fromType;
    }

    public void setFromType(ArticleTypeEnum fromType) {
        this.fromType = fromType;
    }

    public String getArticleClassification() {
        return articleClassification;
    }

    public void setArticleClassification(String articleClassification) {
        this.articleClassification = articleClassification;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCustomStyle() {
        return customStyle;
    }

    public void setCustomStyle(String customStyle) {
        this.customStyle = customStyle;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String getArticleIntroduction() {
        return articleIntroduction;
    }

    public void setArticleIntroduction(String articleIntroduction) {
        this.articleIntroduction = articleIntroduction;
    }
}
