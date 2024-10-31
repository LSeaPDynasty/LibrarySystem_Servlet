package com.servelt.librarysystem_servlet.Interface;

import com.servelt.librarysystem_servlet.Pojo.User;

public interface UserService {
    // 用户注册
    boolean registerUser(User user);

    // 用户登录
    User loginUser(String username, String password);

    // 获取用户信息
    User getUser(int userId);

    // 更新用户信息
    boolean updateUser(User user);
}
