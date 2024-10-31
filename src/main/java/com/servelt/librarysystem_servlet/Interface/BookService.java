package com.servelt.librarysystem_servlet.Interface;

import com.servelt.librarysystem_servlet.Pojo.Book;

import java.util.List;

public interface BookService {
    // 查询所有图书
    List<Book> getBooks();

    // 查询图书
    List<Book> searchBooks(String keyword);

    // 添加图书
    boolean addBook(Book book);

    // 更新图书信息
    boolean updateBook(Book book);

    // 删除图书
    boolean deleteBook(int bookId);
}
