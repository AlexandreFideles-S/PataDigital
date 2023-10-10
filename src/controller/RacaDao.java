package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RacaDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public RacaDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_RACA (ID_RACA int not null,"
        + "primary key(ID_RACA) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS RACA ("
        + "ID_RACA int not null, "
        + "DS_RACA varchar(100) not null ,"
        + "TG_INATIVO boolean not null ,"
        + "primary key (ID_RACA) )";
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