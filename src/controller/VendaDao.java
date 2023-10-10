package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VendaDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public VendaDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_VENDA (ID_VENDA int not null,"
        + "primary key(ID_VENDA) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS VENDA ("
        + "ID_VENDA int not null, "
        + "VL_TOTAL decimal not null ,"
        + "DH_VENDA datetime not null ,"
        + "FK_FUNCIONARIO int not null ,"
        + "FK_FORMA_PAGAMENTO int not null ,"
        + "FK_CLIENTE int not null ,"
        + "primary key (ID_VENDA) )";
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