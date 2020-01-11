package com.example.first.book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> find();

    Book saveBook(Book book);

    void delete(Long id);

    Optional<Book> findOne(Long id);



}
