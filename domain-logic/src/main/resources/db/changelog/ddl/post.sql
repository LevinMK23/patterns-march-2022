--liquibase formatted sql

--changeset levin:create_table_post
create table features.post(
    id serial not null,
    title text,
    content text,
    likes int8,
    primary key (id)
)