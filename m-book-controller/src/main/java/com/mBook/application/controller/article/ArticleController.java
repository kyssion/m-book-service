package com.mBook.application.controller.article;

import com.mBook.application.service.ArticleService;
import com.mBook.module.ArticleInformationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("ariticle/get_ariticle")
    public ArticleInformationBean getAriticle(){
        return articleService.getNeedArticleInformationBean();
    }
}
