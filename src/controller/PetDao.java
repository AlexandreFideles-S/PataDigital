package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PetDao extends ConectarDao {
    private String sql;
    
    public PetDao(){
        super();
    } 
    
    
    public ResultSet buscarPetsClientes ( String cpf ) {
        
        
        // ResultSet buscar =  buscarPetsClientes ( this.txtCpf.getText() );
        //  if ( buscar.next() )
        // {}
        //else
        //{  mensagem "usuario não encontrado cliente não encontrao. "}
        
        
        
        
        
        
        sql = "SELECT * FROM TB_PET where ds_cpf = ? ";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);
      
            return ps.executeQuery();
            
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário! " + err.getMessage());
            return null;
        }
    }
    
}