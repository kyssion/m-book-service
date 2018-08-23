package com.mBook.userInterface;

import com.mBook.module.userModule.UserBean;

public interface UserLoginRegisterInterface {
    /**
     * ·判断用户的信息是否正确
     * @param userBean
     * @return
     */
    boolean correctUserInformation(UserBean userBean);

    /**
     * 注册用户
     * @param userBean
     * @return
     */
    boolean registerUser(UserBean userBean);

    /**
     * 修改用户信息
     * @param userBean
     * @return
     */
    boolean changeUserInforMation(UserBean userBean);

    /**
     * 用户登入信息注册
     * @param userBean
     * @return
     */
    boolean loginRegister(UserBean userBean);
}
