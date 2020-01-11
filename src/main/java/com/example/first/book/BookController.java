package com.example.first.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/list")
    public List<Book> display() {
        return bookService.find();
    }

    @PostMapping("/save")
    public void createBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }


    @PutMapping("/{id}")
    public void updateBook(@PathVariable("id") Long id, @RequestBody Book book){
        bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id){
        bookService.delete(id);

    }

    @GetMapping("/one/{id}")
    public Optional<Book> displayOne(@PathVariable("id") Long id){
        return bookService.findOne(id);
    }


}
