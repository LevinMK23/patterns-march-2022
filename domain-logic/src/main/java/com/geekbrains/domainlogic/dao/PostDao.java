package com.geekbrains.domainlogic.dao;

import com.geekbrains.domainlogic.model.Post;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PostDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public PostDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public Post findById(Long id) {
        return namedParameterJdbcTemplate.queryForObject(
                "select * from post where id = :id",
                new MapSqlParameterSource("id", id),
                (rs, rn) -> Post.builder()
                        .id(rs.getLong("id"))
                        .title(rs.getString("title"))
                        .content(rs.getString("content"))
                        .likes(rs.getLong("likes"))
                        .build()
        );
    }

    @Transactional
    public Post create(Post post) {
        namedParameterJdbcTemplate.update(
                "insert into post (title, content, likes) VALUES (:title, :content, :likes)",
                new MapSqlParameterSource()
                        .addValue("title", post.getTitle())
                        .addValue("content", post.getContent())
                        .addValue("likes", post.getLikes())
        );

        return namedParameterJdbcTemplate.queryForObject(
                "select * from post where id = (select max(id) from post)",
                new MapSqlParameterSource(),
                (rs, rn) -> Post.builder()
                        .id(rs.getLong("id"))
                        .title(rs.getString("title"))
                        .content(rs.getString("content"))
                        .likes(rs.getLong("likes"))
                        .build()
        );
    }
}
