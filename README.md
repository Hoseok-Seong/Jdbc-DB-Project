create database metadb;

use metadb;

create table product(
id int primary key auto_increment,
name varchar(50),
price int,
qty int,
created_at timestamp
);
