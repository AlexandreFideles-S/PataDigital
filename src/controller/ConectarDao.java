package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectarDao {
    public Connection con;
    public ConectarDao () { 
        
    try { 
        con = DriverManager.getConnection ("", "" , "");
    }
    catch ( SQLException err) {
        JOptionPane.showMessageDialog(null, "Erro de Conexão com o MySQL ...\n" + err.getMessage());}
    }
}
