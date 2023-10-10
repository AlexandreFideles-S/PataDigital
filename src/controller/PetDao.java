package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PetDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public PetDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_PET (ID_PET int not null,"
        + "primary key(ID_PET) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS PET ("
        + "ID_PET int not null, "
        + "DS_NOME varchar(100) not null ,"
        + "DT_NASCIMENTO datetime not null ,"
        + "FK_RACA int not null ,"
        + "FK_CLIENTE int not null ,"
        + "primary key (ID_PET) )";
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