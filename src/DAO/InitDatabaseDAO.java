/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class InitDatabaseDAO {

    public static void init() {
        Connection conn = new ConexaoDAO().conectaDBSemDatabase();

        try {
            String sql = "create database if not exists dbmyshop;\n"
                    + "use dbmyshop;\n"
                    + "\n"
                    + "create table if not exists user(\n"
                    + "	id_user int auto_increment primary key,\n"
                    + "    email_user varchar(50) not null,\n"
                    + "    password_user varchar(64) not null\n"
                    + ");\n"
                    + "\n"
                    + "create table if not exists produto(\n"
                    + "	id_produto int auto_increment primary key,\n"
                    + "    nome_produto varchar(50) not null,\n"
                    + "    preco_produto double not null,\n"
                    + "    qtdeEstoque_produto int not null\n"
                    + ");\n"
                    + "\n"
                    + "create table if not exists venda(\n"
                    + "	id_venda int auto_increment primary key,\n"
                    + "    data_venda date,\n"
                    + "    valor_total double\n"
                    + ");\n"
                    + "\n"
                    + "create table if not exists venda_produto(\n"
                    + "	id_venda_produto int auto_increment primary key,\n"
                    + "    id_produto int,\n"
                    + "    id_venda int,\n"
                    + "	quantidade int,\n"
                    + "    preco_unitario double,\n"
                    + "    foreign key (id_produto) references produto(id_produto),\n"
                    + "    foreign key (id_venda) references venda(id_venda)\n"
                    + ");\n"
                    + "\n"
                    + "insert into user(email_user, password_user) values(\"admin@teste.com\", \"JAvlGPq9JyTdtvBO6x2llnRI1+gxwIyPqCKAn3THIKk=\");";

            // Divide o script em comandos individuais
            String[] commands = sql.split(";");

            // Cria um Statement para executar os comandos SQL
            try (Statement stmt = conn.createStatement()) {
                // Executa cada comando individualmente
                for (String command : commands) {
                    // Remove espaços em branco no início e no final do comando
                    command = command.trim();
                    // Verifica se o comando é um comando DDL ou DML
                    if (command.toLowerCase().startsWith("create") || command.toLowerCase().startsWith("use")) {
                        // Executa o comando DDL
                        stmt.execute(command);
                    } else if (command.toLowerCase().startsWith("insert") || command.toLowerCase().startsWith("update") || command.toLowerCase().startsWith("delete")) {
                        // Executa o comando DML
                        stmt.executeUpdate(command);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "InitDatabaseDAO: " + e.getMessage());
        }
    }

}
