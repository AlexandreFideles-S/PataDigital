package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AtendimentoServicoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public AtendimentoServicoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_ATENDIMENTO_SERVICO (ID_ATENDIMENTO_SERVICO int not null,"
        + "primary key(ID_ATENDIMENTO_SERVICO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS ATENDIMENTO_SERVICO ("
        + "ID_ATENDIMENTO_SERVICO int not null, "
        + "FK_ATENDIMENTO int not null, "
        + "FK_SERVICO int not null, "
        + "primary key (ID_ATENDIMENTO_SERVICO) )";
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