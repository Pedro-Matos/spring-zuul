package com.rho.books.controller;

import com.rho.books.bean.Book;
import com.rho.books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    private final static String BOOKS_VARIABLE = "books";
    private static final String BOOKS_PAGE = "table";

    @Autowired
    private IBookService bookService;

    @GetMapping(value = "/")
    public String getBook(Model model){
        List<Book> books = bookService.displayShelf();
        model.addAttribute(BOOKS_VARIABLE, books);
        return BOOKS_PAGE;
    }
}