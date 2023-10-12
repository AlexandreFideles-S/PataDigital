package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionarioDao extends ConectarDao {
    private String sql;
    
    public FuncionarioDao(){
        super();
    } 
    
    public ResultSet validarLogin (String login, String senha){
        sql = "SELECT * FROM TB_FUNCIONARIO FUN LEFT JOIN TB_ENDERECO END ON END.ID_ENDERECO = FUN.FK_ENDERECO WHERE FUN.DS_LOGIN='" + login + "' AND FUN.DS_SENHA = '" + senha + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }
}