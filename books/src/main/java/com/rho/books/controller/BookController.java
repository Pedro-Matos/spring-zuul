package com.rho.books.controller;

import com.rho.books.bean.Book;
import com.rho.books.bean.BookType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class BookController {

    @GetMapping("/")
    public Book getBook() {
        Book book1 = new Book("Steven Erikson", "Gardens of the Moon", BookType.FANTASY, 712);

        return book1;
    }


}
