package com.servelt.librarysystem_servlet.Interface;

import com.servelt.librarysystem_servlet.POJO.User;

public interface LoginService {
    // 用户注册
    boolean registerUser(User user);

    // 用户登录
    User loginUser(String username, String password);
}
