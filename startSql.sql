create database dbmyshop;
use dbmyshop;

create table user(
	id_user int auto_increment primary key,
    email_user varchar(50) not null,
    password_user varchar(64) not null
);

create table produto(
	id_produto int auto_increment primary key,
    nome_produto varchar(50) not null,
    preco_produto double not null,
    qtdeEstoque_produto int not null
);

insert into user(email_user, password_user) values("admin@teste.com", "JAvlGPq9JyTdtvBO6x2llnRI1+gxwIyPqCKAn3THIKk=");