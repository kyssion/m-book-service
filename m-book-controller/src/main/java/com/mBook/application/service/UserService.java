package com.mBook.application.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mBook.module.UserBean;
import com.mBook.userInterface.UserInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    UserInterface userInterface;

    public UserBean getUserInfo(UserBean userBean){
        return userInterface.getUserInfo(userBean);
    }
}
