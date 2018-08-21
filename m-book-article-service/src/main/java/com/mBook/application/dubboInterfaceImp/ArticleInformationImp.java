package com.mBook.application.dubboInterfaceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.mBook.articleEnum.ArticleTypeEnum;
import com.mBook.articleInterface.ArticleInterface;
import com.mBook.module.ArticleInformationBean;

import java.io.IOException;

@Service
public class ArticleInformationImp implements ArticleInterface {
    @Override
    public ArticleInformationBean getArtileInformationBean() {
        ArticleInformationBean bean = new ArticleInformationBean();
        bean.setAddTime(System.currentTimeMillis());
        bean.setFromType(ArticleTypeEnum.BLOWEBSIE);
        bean.setUrl("adsfasdfasdfefxdfwe");
        bean.setArticleClassification("技术文章");
        bean.setArticleFrom("https://juejin.im/");
        bean.setArticleName("一篇文章");
        bean.setArticleTheme("java详情");
        bean.setCustomStyle("{格式未知}");
        bean.setArticleIntroduction("文章简介");
        bean.setArticleImg("文章图片");
        int a=1/0;
        return bean;
    }
}
