package com.mBook.userInterface;


import com.mBook.module.UserBean;

public interface UserInterface {

    /**
     * 注册用户
     * @param userBean
     * @return
     */
    boolean registerUser(UserBean userBean);

    /**
     * 用户登入
     * @param userBean
     * @return
     */
    boolean login(UserBean userBean);


    /**
     * 修改用户信息
     * @param userBean
     * @return
     */
    boolean changeUserInforMation(UserBean userBean);

    /**
     * 获取用户信息
     * @param userBean
     * @return
     */
    UserBean getUserInfo(UserBean userBean);
}
