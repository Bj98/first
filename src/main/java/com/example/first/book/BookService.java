package com.example.first.book;

import java.util.List;

public interface BookService {
    List<Book> find();

    Book saveBook(Book book);

    void delete(Long id);



}
