package com.mBook.application.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mBook.articleInterface.ArticleInterface;
import com.mBook.module.ArticleInformationBean;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Reference
    ArticleInterface articleInterface;

    public ArticleInformationBean getNeedArticleInformationBean(){
        return articleInterface.getArtileInformationBean();
    }
}
