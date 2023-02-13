# JDBC를 이용한 자바 DBApp

## 데이터베이스 테이블

create database metadb;

use metadb;

create table product(
id int primary key auto_increment,
name varchar(50),
price int,
qty int,
created_at timestamp
);
