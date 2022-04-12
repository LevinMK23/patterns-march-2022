package com.geekbrains.mapstructtest.controller;

import com.geekbrains.mapstructtest.mapper.BookMapper;
import com.geekbrains.mapstructtest.model.Book;
import com.geekbrains.mapstructtest.service.BookService;
import com.geekbrains.mapstructtest.view.BookView;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final BookService bookService;
    private final BookMapper mapper;

    public HomeController(BookService bookService, BookMapper mapper) {
        this.bookService = bookService;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public BookView getBook(@PathVariable("id") long id) {
        return mapper.mapDto(bookService.getBookById(id));
    }

    @PostMapping
    public BookView storeBook(@RequestBody BookView view) {
        return mapper.mapDto(bookService.storeBook(view));
    }

}
