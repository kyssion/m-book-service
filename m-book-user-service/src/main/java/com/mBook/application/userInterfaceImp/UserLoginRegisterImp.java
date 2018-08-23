package com.mBook.application.userInterfaceImp;

import com.mBook.module.userModule.UserBean;
import com.mBook.userInterface.UserLoginRegisterInterface;

public class UserLoginRegisterImp implements UserLoginRegisterInterface {
    @Override
    public boolean correctUserInformation(UserBean userBean) {
        return false;
    }

    @Override
    public boolean registerUser(UserBean userBean) {
        return false;
    }

    @Override
    public boolean changeUserInforMation(UserBean userBean) {
        return false;
    }

    @Override
    public boolean loginRegister(UserBean userBean) {
        return false;
    }
}
