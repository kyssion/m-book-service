package com.mBook.application.controller.user;

import com.mBook.application.model.ResponseModel;
import com.mBook.application.model.Page;
import com.mBook.application.service.UserService;
import com.mBook.application.status.HeaderStatus;
import com.mBook.module.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("test")
    public ResponseModel getAriticle() {
        return ResponseModel.getResponseModel(HeaderStatus.OK,userService.getUserInfo(new UserBean()));
    }
    @RequestMapping("test2")
    public ResponseModel getAriticle2()  {
        return ResponseModel.getResponseModel(HeaderStatus.OK,userService.getUserInfo(new UserBean()),new Page(1,2,3));
    }
    @RequestMapping("test3")
    public ResponseModel getAriticle3()  {
        return ResponseModel.getResponseModel(400,"sdfsdf",userService.getUserInfo(new UserBean()),new Page(1,2,3));
    }
}
