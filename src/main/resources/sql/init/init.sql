create table log
(
    id             int auto_increment
        primary key,
    create_time    datetime default CURRENT_TIMESTAMP not null,
    update_time    datetime default CURRENT_TIMESTAMP not null,
    content        varchar(255)                       not null,
    class_invoker  varchar(255)                       not null,
    method_invoker varchar(255)                       not null,
    constraint log_id_uindex
        unique (id)
) comment '日志';

create table comment
(
    id          int auto_increment
        primary key,
    create_time datetime default CURRENT_TIMESTAMP null,
    update_time datetime default CURRENT_TIMESTAMP null,
    name        varchar(255)                       null,
    comment     varchar(255)                       null,
    url         varchar(255)                       null,
    constraint comment_id_uindex
        unique (id)
)
    comment '评论';

create table blog
(
    id          int auto_increment
        primary key,
    create_time datetime default CURRENT_TIMESTAMP null,
    update_time datetime default CURRENT_TIMESTAMP null,
    title       varchar(255)                       null,
    content     varchar(255)                       null,
    category    varchar(255)                       null,
    constraint blog_id_uindex
        unique (id)
)
    comment '博客';

