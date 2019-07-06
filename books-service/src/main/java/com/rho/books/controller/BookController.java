package com.rho.books.controller;

import com.rho.books.bean.Book;
import com.rho.books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping()
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/")
    public List<Book> getBook() {
        List<Book> books = bookService.displayShelf();
        return books;
    }


}
