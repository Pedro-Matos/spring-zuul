package com.rho.books.service;

import com.rho.books.bean.Book;
import com.rho.books.bean.BookType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService {
    private final static List<Book> shelf = new ArrayList();

    static {
        Book book1 = new Book("Steven Erikson", "Gardens of the Moon", BookType.FANTASY, 712);
        Book book2 = new Book("Ashlee Vance ", "Elon Musk", BookType.BIOGRAPHY, 416);
        Book book3 = new Book("Steven Erikson", "Deadhouse Gates", BookType.FANTASY, 960);
        Book book4 = new Book("Lauren Weisberger", "The Wives", BookType.ROMANCE, 416);

        shelf.add(book1);
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book4);
    }

    @Override
    public List<Book> displayShelf() {
        return shelf;
    }

}
