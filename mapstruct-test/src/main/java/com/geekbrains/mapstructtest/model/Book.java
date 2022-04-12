package com.geekbrains.mapstructtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private long id;
    private String title;
    private int pages;
    private double price;

    private Author author;

}
