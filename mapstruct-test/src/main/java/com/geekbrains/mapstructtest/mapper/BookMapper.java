package com.geekbrains.mapstructtest.mapper;

import com.geekbrains.mapstructtest.model.Author;
import com.geekbrains.mapstructtest.model.Book;
import com.geekbrains.mapstructtest.service.IdSupplier;
import com.geekbrains.mapstructtest.view.BookView;
import org.mapstruct.AfterMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring"
)
public abstract class BookMapper {

    @Autowired
    private IdSupplier idSupplier;

    public  abstract Book mapView(BookView bookView);

    public  abstract  BookView mapDto(Book book);

    @AfterMapping
    public void afterMapView(BookView view, @MappingTarget Book book) {
        Author author = new Author();
        long id = idSupplier.getNext();
        author.setId(id);
        author.setName(view.getAuthorName());
        author.setSurname(view.getAuthorSurname());
        book.setAuthor(author);
    }

    @AfterMapping
    public void afterMapDto(Book book, @MappingTarget BookView view) {
        view.setAuthorName(book.getAuthor().getName());
        view.setAuthorSurname(book.getAuthor().getSurname());
    }

}
