package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FuncionarioDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public FuncionarioDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_FUNCIONARIO (ID_FUNCIONARIO int not null,"
        + "primary key(ID_FUNCIONARIO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIO ("
        + "ID_FUNCIONARIO int not null, "
        + "DS_NOME varchar(100) not null ,"
        + "DS_CPF varchar(100) not null ,"
        + "TG_INATIVO boolean not null ,"
        + "DS_CELULAR varchar(100) not null ,"
        + "DS_TELEFONE varchar(100) not null ,"
        + "DS_EMAIL varchar(100) not null ,"
        + "DS_LOGIN varchar(100) not null ,"
        + "DS_SENHA varchar(100) not null ,"
        + "DS_PERMISSAO varchar(100) not null ,"
        + "FK_ENDERECO int not null ,"
        + "primary key (ID_FORMA_PAGAMENTO) )";
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