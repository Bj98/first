package com.example.first.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

@Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> find() {
        return bookRepository.findAll();
    }


    public Book saveBook(Book book){
        return bookRepository.save(book);
    }


    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Optional<Book> findOne(Long id){
        return bookRepository.findById(id);
    }
}
