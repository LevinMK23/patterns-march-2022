package com.geekbrains.mapstructtest.service;

import com.geekbrains.mapstructtest.mapper.BookMapper;
import com.geekbrains.mapstructtest.model.Book;
import com.geekbrains.mapstructtest.view.BookView;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private final Map<Long, Book> storage;
    private final IdSupplier idSupplier;
    private final BookMapper mapper;

    public BookService(IdSupplier idSupplier, BookMapper mapper) {
        this.idSupplier = idSupplier;
        this.mapper = mapper;
        storage = new HashMap<>();
    }

    public Book storeBook(BookView bookView) {
        if (bookView.getId() != null) {
            throw new RuntimeException("Stored book should not be have id");
        }
        long id = idSupplier.getNext();
        bookView.setId(id);
        // mapping
        Book book = mapper.mapView(bookView);
        storage.put(id, book);
        return book;
    }

    public Book getBookById(long id) {
        return storage.get(id);
    }

}
