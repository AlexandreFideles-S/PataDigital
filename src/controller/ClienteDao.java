package controller;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteDao extends ConectarDao {
    private String sql;
    
    public ClienteDao(){
        super();
    }
    
    public ResultSet validarLogin (String login, String senha){
        sql = "SELECT * FROM TB_CLIENTE CLI "
                + "LEFT JOIN TB_ENDERECO END ON END.FK_CLIENTE = CLI.ID_CLIENTE "
                + "WHERE CLI.DS_EMAIL='" + login + "' AND CLI.DS_SENHA = '" + senha + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }
    
    public ResultSet incluir(Cliente obj){
        sql = "INSERT INTO TB_CLIENTE (DS_NOME, DS_CPF, DT_NASCIMENTO, DS_CELULAR, DS_TELEFONE, DS_EMAIL, DS_SENHA) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getDS_NOME());
            ps.setString(2,obj.getDS_CPF());
            ps.setDate(3, (Date) obj.getDT_NASCIMENTO());
            ps.setString(4,obj.getDS_CELULAR());
            ps.setString(5,obj.getDS_TELEFONE());
            ps.setString(6,obj.getDS_SENHA());
            
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário! " + err.getMessage());
        }
        
        return null;
    }
    
    public ResultSet buscarClienteByCpf(String cpf) {
        sql = "SELECT * FROM TB_CLIENTE WHERE DS_CPF = ?";

        try{        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);
            
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet buscarTodosClientes() {
        sql = "SELECT * FROM TB_CLIENTE ORDER BY DS_NOME";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário! " + err.getMessage());
            return null;
        }
    }
}