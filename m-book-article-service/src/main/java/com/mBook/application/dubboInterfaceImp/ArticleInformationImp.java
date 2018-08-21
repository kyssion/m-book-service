package com.mBook.application.dubboInterfaceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.mBook.articleInterface.ArticleInterface;
import com.mBook.mBookEnum.article.ArticleTypeEnum;
import com.mBook.module.ArticleInformationBean;


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
        return bean;
    }
}
