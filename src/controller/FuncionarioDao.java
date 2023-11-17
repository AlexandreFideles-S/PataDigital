package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;

public class FuncionarioDao extends ConectarDao {
    private String sql;
    
    public FuncionarioDao(){
        super();
    } 
    
    public ResultSet validarLogin (String login, String senha){
        sql = "SELECT * FROM TB_FUNCIONARIO FUN "
                + "LEFT JOIN TB_ENDERECO END ON END.FK_FUNCIONARIO = FUN.ID_FUNCIONARIO "
                + "WHERE FUN.DS_LOGIN='" + login + "' AND FUN.DS_SENHA = '" + senha + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }
    
    public void incluir(Funcionario obj){
        sql = "INSERT INTO TB_FUNCIONARIO (DS_NOME, DS_CPF, DS_CELULAR, DS_TELEFONE, DS_EMAIL, DS_SENHA, TG_INATIVO, DS_LOGIN, DS_PERMISAO) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getDS_NOME());
            ps.setString(2,obj.getDS_CPF());
            ps.setString(3,obj.getDS_CELULAR());
            ps.setString(4,obj.getDS_TELEFONE());
            ps.setString(5,obj.getDS_EMAIL());
            ps.setString(6,obj.getDS_SENHA());
            ps.setBoolean(7,obj.isTG_INATIVO());
            ps.setString(8,obj.getDS_LOGIN());
            ps.setString(9,obj.getDS_PERMISSAO());
            
            ps.execute();
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário! " + err.getMessage());
        }
    }
}