package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FormaPagamentoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public FormaPagamentoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_FORMA_PAGAMENTO (ID_FORMA_PAGAMENTO int not null,"
        + "primary key(ID_FORMA_PAGAMENTO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS FORMA_PAGAMENTO ("
        + "ID_FORMA_PAGAMENTO int not null, "
        + "DS_FORMA_PAGAMENTO varchar(100) not null ,"
        + "TG_INATIVO boolean not null ,"
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