package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AtendimentoDao extends ConectarDao {
    String sql;
    PreparedStatement ps;
    public AtendimentoDao() { super(); }
    public void criarBanco() {
    try { 
        sql = "CREATE TABLE IF NOT EXISTS TB_ATENDIMENTO (ID_AGENDAMENTO int not null,"
        + "primary key(ID_AGENDAMENTO) ) ";
        ps = con.prepareStatement(sql);
        ps.execute();
        
        sql = "CREATE TABLE IF NOT EXISTS AGENDAMENTO ("
        + "ID_AGENDAMENTO int not null, "
        + "FK_PET int not null, "
        + "FK_CLIENTE int not null, "
        + "FK_FUNCIONARIO int not null, "
        + "FK_FORMA_PAGAMENTO int not null, "
        + "VL_TOTAL double not null ,"
        + "DH_ATENDIMENTO datetime not null, "
        + "DS_CANCELAMENTO varchar(100) not null ,"
        + "primary key (ID_AGENDAMENTO) )";
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