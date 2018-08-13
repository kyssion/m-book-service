package com.mBook.application.dubboInterfaceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.mBook.articleEnum.ArticleTypeEnum;
import com.mBook.articleInterface.ArticleInterface;
import com.mBook.module.ArticleInformationBean;

@Service
public class ArticleInformationImp implements ArticleInterface {
    @Override
    public ArticleInformationBean getArtileInformationBean() {
        ArticleInformationBean bean = new ArticleInformationBean();
        bean.setAddTime(System.currentTimeMillis());
        bean.setAddType(ArticleTypeEnum.BLOWEBSIE);
        bean.setArticleUrl("adsfasdfasdfefxdfwe");
        bean.setArticleClassification("技术文章");
        bean.setArticleFrom("https://juejin.im/");
        bean.setArticleName("一篇文章");
        bean.setArticleTheme("java详情");
        bean.setCustomStyle("{格式未知}");
        return bean;
    }
}
