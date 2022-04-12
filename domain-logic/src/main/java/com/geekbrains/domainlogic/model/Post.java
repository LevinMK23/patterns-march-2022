package com.geekbrains.domainlogic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Post {

    private Long id;
    private String title;
    private String content;
    private Long likes;

}
