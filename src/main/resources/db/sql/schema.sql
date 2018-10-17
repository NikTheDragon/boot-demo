create table book
(
  id          integer      not null,
  reader      varchar(255) not null,
  isbn        varchar(255) not null,
  title       varchar(255) not null,
  author      varchar(255) not null,
  description varchar(255) not null,
  primary key (id)
);