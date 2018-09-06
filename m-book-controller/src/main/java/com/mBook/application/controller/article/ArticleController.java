package com.mBook.application.controller.article;

import com.mBook.application.model.HeaderModel;
import com.mBook.application.model.Page;
import com.mBook.application.model.TestModel;
import com.mBook.application.service.ArticleService;
import com.mBook.application.status.HeaderStatus;
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

    @RequestMapping("test")
    public HeaderModel getAriticle() {
        return HeaderModel.getHeaderModel(HeaderStatus.OK,articleService.getNeedArticleInformationBean());
    }
    @RequestMapping("test2")
    public HeaderModel getAriticle2()  {
        return HeaderModel.getHeaderModel(HeaderStatus.OK,articleService.getNeedArticleInformationBean(),new Page(1,2,3));
    }
    @RequestMapping("test3")
    public HeaderModel getAriticle3()  {
        return HeaderModel.getHeaderModel(400,"sdfsdf",articleService.getNeedArticleInformationBean(),new Page(1,2,3));
    }
}
