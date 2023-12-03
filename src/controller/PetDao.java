package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Pet;

public class PetDao extends ConectarDao {
    private String sql;
    
    public PetDao(){
        super();
    } 
    
    
    public ResultSet buscarPetsClientes ( String cpf ) {
        
        
       
        
        
        
        
        
        sql = "SELECT * FROM TB_PET left join tb_raca on tb_pet.fk_raca = tb_raca.id_raca LEFT JOIN TB_CLIENTE ON TB_CLIENTE.ID_CLIENTE = TB_PET.FK_CLIENTE where TB_CLIENTE.ds_cpf = ? ";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);
      
            return ps.executeQuery();
            
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário! " + err.getMessage());
            return null;
        }
    }
    
    
    public ResultSet buscartodosPets () {
        
        
        // ResultSet buscar =  buscarPetsClientes ( this.txtCpf.getText() );
        //  if ( buscar.next() )
        // {}
        //else
        //{  mensagem "usuario não encontrado cliente não encontrao. "}
        
        
    
        
        
        sql = "SELECT * FROM TB_PET left join tb_raca on tb_pet.fk_raca = tb_raca.id_raca LEFT JOIN TB_CLIENTE ON TB_CLIENTE.ID_CLIENTE = TB_PET.FK_CLIENTE order by TB_PET.ds_nome ";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
            
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário! " + err.getMessage());
            return null;
        }
    }
    
    public void incluir(Pet obj){
        sql = "INSERT INTO TB_PET (DS_NOME, DT_NASCIMENTO, FK_RACA, FK_CLIENTE) " +
                "VALUES (?, ?, ?, ?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getDS_NOME());
            ps.setDate(2,  new java.sql.Date(obj.getDT_NASCIMENTO().getTime()));
            ps.setLong(3, obj.getFK_RACA());
            ps.setInt(4, obj.getFK_CLIENTE());
            
            
            ps.execute();
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário! " + err.getMessage());
        }
    }
    
}