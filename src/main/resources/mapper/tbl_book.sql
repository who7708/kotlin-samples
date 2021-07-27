create table if not exists tbl_book
(
    book_id           varchar(255)  not null
    primary key,
    book_author       varchar(255)  null,
    book_brief        varchar(6000) null,
    book_isbn         varchar(255)  null,
    book_name         varchar(255)  null,
    book_price        bigint        not null,
    book_publish_date varchar(19)   null,
    book_publisher    varchar(255)  null,
    book_type_id      varchar(255)  null,
    book_count        int           not null
    );

