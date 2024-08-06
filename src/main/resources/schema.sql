create table TODO
(
    id bigint not null,
    username varchar(255) not null,
    description varchar(255) not null,
    target_date date not null,
    done boolean,
    primary key (id)

);