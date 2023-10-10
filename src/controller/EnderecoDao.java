package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class EnderecoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public EnderecoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_ENDERECO (ID_ENDERECO int not null,"
        + "primary key(ID_ENDERECO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS ENDERECO ("
        + "ID_ENDERECO int not null, "
        + "DS_LOGRADOURO varchar(100) not null ,"
        + "DS_BAIRRO varchar(100) not null ,"
        + "DS_NUMERO varchar(100) not null ,"
        + "DS_COMPLEMENTO varchar(100) not null ,"
        + "DS_CEP varchar(100) not null ,"
        + "DS_CIDADE varchar(100) not null ,"
        + "DS_ESTADO varchar(100) not null ,"
        + "DS_PAIS varchar(100) not null ,"
        + "DS_UF varchar(100) not null ,"
        + "primary key (ID_ENDERECO) )";
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