package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProdutoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public ProdutoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_PRODUTO (ID_PRODUTO int not null,"
        + "primary key(ID_PRODUTO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS PRODUTO ("
        + "ID_PRODUTO int not null, "
        + "DS_PRODUTO varchar(100) not null ,"
        + "DS_NOME varchar(100) not null ,"
        + "VL_PRODUTO decimal not null ,"
        + "TG_INATIVO boolean not null ,"
        + "QT_PRODUTO int not null ,"
        + "primary key (ID_PRODUTO) )";
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