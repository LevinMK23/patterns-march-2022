package com.geekbrains.mapstructtest.view;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookView {

    private Long id;
    private String title;
    private Integer pages;
    private Double price;
    private String authorName;
    private String authorSurname;

}
