package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Endereco;

public class EnderecoDao extends ConectarDao {
    private String sql;
    
    public EnderecoDao(){
        super();
    }
    
    public ResultSet incluir(Endereco obj){
        sql = "INSERT INTO TB_ENDERECO (DS_LOGRADOURO, DS_BAIRRO, DS_NUMERO, DS_COMPLEMENTO, DS_CEP, DS_CIDADE, DS_ESTADO, DS_PAIS, DS_UF)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getDS_LOGRADOURO());
            ps.setString(2,obj.getDS_BAIRRO());
            ps.setString(3, obj.getDS_NUMERO());
            ps.setString(4,obj.getDS_COMPLEMENTO());
            ps.setString(5,obj.getDS_CEP());
            ps.setString(6,obj.getDS_CIDADE());
            ps.setString(7,obj.getDS_ESTADO());
            ps.setString(8,obj.getDS_PAIS());
            ps.setString(9,obj.getDS_UF());

            ResultSet resul = ps.executeQuery();
            return resul;
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário! " + err.getMessage());
        }
        
        return null;
    }
    
    public ResultSet buscarEnderecoByIdCliente(int idCliente) {
        sql = "SELECT * FROM TB_ENDERECO WHERE FK_CLIENTE = ?";

        try{        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet buscarEnderecoByIdFuncionario(int idFuncionario) {
        sql = "SELECT * FROM TB_ENDERECO WHERE FK_FUNCIONARIO = ?";

        try{        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idFuncionario);
            
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null;
        }
    }
}