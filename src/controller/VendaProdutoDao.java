package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VendaProdutoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public VendaProdutoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_VENDA_PRODUTO (ID_VENDA_PRODUTO int not null,"
        + "primary key(ID_VENDA_PRODUTO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS VENDA ("
        + "ID_VENDA_PRODUTO int not null, "
        + "QT_PRODUTO int not null ,"
        + "FK_PRODUTO int not null ,"
        + "FK_VENDA int not null ,"
        + "primary key (ID_VENDA_PRODUTO) )";
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