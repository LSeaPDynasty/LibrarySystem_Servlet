package com.servelt.librarysystem_servlet.Interface;

import com.servelt.librarysystem_servlet.POJO.Book;
import com.servelt.librarysystem_servlet.POJO.User;

import java.util.List;

public interface DatabaseAccess {
    // 查询所有用户
    List<User> getAllUsers();

    // 添加用户
    boolean addUser(User user);

    // 更新用户信息
    boolean updateUser(User user);

    // 删除用户
    boolean deleteUser(int userId);

    // 查询所有图书
    List<Book> getAllBooks();

    // 添加图书
    boolean addBook(Book book);

    // 更新图书信息
    boolean updateBook(Book book);

    // 删除图书
    boolean deleteBook(int bookId);
}