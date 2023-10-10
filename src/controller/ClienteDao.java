package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public ClienteDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_CLIENTE (ID_CLIENTE int not null,"
        + "primary key(ID_CLIENTE) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS CLIENTE ("
        + "ID_CLIENTE int not null, "
        + "DS_NOME varchar(100) not null ,"
        + "DS_CPF varchar(15) not null ,"
        + "DT_NASCIMENTO datetime not null ,"
        + "DS_CELULAR varchar(15) not null ,"
        + "DS_TELEFONE varchar(15) not null ,"
        + "DS_EMAIL varchar(100) not null ,"
        + "DS_SENHA varchar(100) not null ,"
        + "FK_ENDERECO int not null ,"
        + "primary key (ID_CLIENTE) )";
        ps = con.prepareStatement(sql);
        ps.execute();
        ps.close();
        con.close();
        JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
    } 
    catch (SQLException err) {
    JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
    }}
    
}