package com.mBook.module;

import com.mBook.articleEnum.ArtocleTypeEnum;

import java.io.Serializable;

public class ArtocleInformationBean implements Serializable {
    private String articleName;
    private long addTime;
    private String articleTheme;
    private String articleFrom;
    private ArtocleTypeEnum addType;
    private String articleClassification;//文章分类
    private String article;//文章内容markdown格式
    private String customStyle;//自定义样式

    public String getCustomStyle() {
        return customStyle;
    }

    public void setCustomStyle(String customStyle) {
        this.customStyle = customStyle;
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

    public ArtocleTypeEnum getAddType() {
        return addType;
    }

    public void setAddType(ArtocleTypeEnum addType) {
        this.addType = addType;
    }

    public String getArticleClassification() {
        return articleClassification;
    }

    public void setArticleClassification(String articleClassification) {
        this.articleClassification = articleClassification;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }
}
