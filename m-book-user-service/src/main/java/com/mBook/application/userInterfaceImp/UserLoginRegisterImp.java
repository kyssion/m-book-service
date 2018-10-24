package com.mBook.application.userInterfaceImp;


import com.alibaba.dubbo.config.annotation.Service;
import com.mBook.module.UserBean;
import com.mBook.userInterface.UserInterface;

@Service
public class UserLoginRegisterImp implements UserInterface {

    @Override
    public boolean registerUser(UserBean userBean) {
        return false;
    }

    @Override
    public boolean login(UserBean userBean) {
        return false;
    }

    @Override
    public boolean changeUserInforMation(UserBean userBean) {
        return false;
    }

    @Override
    public UserBean getUserInfo(UserBean userBean) {
        return new UserBean();
    }
}
