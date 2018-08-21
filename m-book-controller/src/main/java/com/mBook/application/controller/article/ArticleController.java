package com.mBook.application.controller.article;

import com.mBook.application.model.HeaderModel;
import com.mBook.application.service.ArticleService;
import com.mBook.application.status.HeaderStatus;
import com.mBook.module.ArticleInformationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ariticle")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("get_ariticle")
    public HeaderModel getAriticle() throws CloneNotSupportedException {
        return HeaderModel.createHeaderModel(HeaderStatus.OK,articleService.getNeedArticleInformationBean());
    }
    @RequestMapping("test")
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,reason="no no no")
    public HeaderModel getAriticle2(){
        HeaderModel headerModel= new HeaderModel();
        headerModel.setHeader(HeaderStatus.OK);
        headerModel.setBody(articleService.getNeedArticleInformationBean());
        return headerModel;
    }
}
