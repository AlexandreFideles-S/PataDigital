package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ServicoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public ServicoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_SERVICO (ID_SERVICO int not null,"
        + "primary key(ID_SERVICO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS SERVICO ("
        + "ID_SERVICO int not null, "
        + "DS_NOME varchar(100) not null ,"
        + "DS_SERVICO varchar(100) not null ,"
        + "VL_SERVICO decimal not null ,"
        + "TG_INATIVO boolean not null ,"
        + "primary key (ID_SERVICO) )";
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