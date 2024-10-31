package com.servelt.librarysystem_servlet.Interface;

import com.servelt.librarysystem_servlet.Pojo.Book;
import com.servelt.librarysystem_servlet.Pojo.User;

import java.util.List;

public interface AdminService {
    // 获取所有用户
    List<User> getUsers();

    // 添加用户
    boolean addUser(User user);

    // 更新用户信息
    boolean updateUser(User user);

    // 删除用户
    boolean deleteUser(int userId);

    // 获取所有图书
    List<Book> getBooks();

    // 添加图书
    boolean addBook(Book book);

    // 更新图书信息
    boolean updateBook(Book book);

    // 删除图书
    boolean deleteBook(int bookId);
}
