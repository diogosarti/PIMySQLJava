create database if not exists dbmyshop;
use dbmyshop;

create table if not exists user(
	id_user int auto_increment primary key,
    email_user varchar(50) not null,
    password_user varchar(64) not null
);

create table if not exists produto(
	id_produto int auto_increment primary key,
    nome_produto varchar(50) not null,
    preco_produto double not null,
    qtdeEstoque_produto int not null
);

create table if not exists venda(
	id_venda int auto_increment primary key,
    data_venda date,
    valor_total double
);

create table if not exists venda_produto(
	id_venda_produto int auto_increment primary key,
    id_produto int,
    id_venda int,
	quantidade int,
    preco_unitario double,
    foreign key (id_produto) references produto(id_produto),
    foreign key (id_venda) references venda(id_venda)
);

insert into user(email_user, password_user) values("admin@teste.com", "JAvlGPq9JyTdtvBO6x2llnRI1+gxwIyPqCKAn3THIKk=");