package com.mBook.application.controller.article;

import com.mBook.application.model.HeaderModel;
import com.mBook.application.service.ArticleService;
import com.mBook.application.status.HeaderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ariticle")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("get_ariticle")
    public HeaderModel getAriticle(){
        HeaderModel headerModel= new HeaderModel();
        headerModel.setHeader(HeaderStatus.OK);
        headerModel.setBody(articleService.getNeedArticleInformationBean());
        return headerModel;
    }
}
