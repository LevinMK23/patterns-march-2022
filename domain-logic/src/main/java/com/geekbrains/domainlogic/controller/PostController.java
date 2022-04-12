package com.geekbrains.domainlogic.controller;

import com.geekbrains.domainlogic.dao.PostDao;
import com.geekbrains.domainlogic.model.Post;
import com.geekbrains.domainlogic.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostDao postDao;
    private final PostRepository postRepository;

    public PostController(PostDao postDao,
                          PostRepository postRepository) {
        this.postDao = postDao;
        this.postRepository = postRepository;
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") Long id) {
        com.geekbrains.domainlogic.entity.Post entity = postRepository.getById(id);
        return Post.builder()
                .likes(entity.getLikes())
                .content(entity.getContent())
                .title(entity.getTitle())
                .id(entity.getId())
                .build();
    }

    @PostMapping
    public Post post(@RequestBody Post post) {

        com.geekbrains.domainlogic.entity.Post entity = new com.geekbrains.domainlogic.entity.Post();
        entity.setLikes(post.getLikes());
        entity.setTitle(post.getTitle());
        entity.setContent(post.getContent());
        postRepository.save(entity);

        return Post.builder()
                .likes(entity.getLikes())
                .content(entity.getContent())
                .title(entity.getTitle())
                .id(entity.getId())
                .build();
    }

}
