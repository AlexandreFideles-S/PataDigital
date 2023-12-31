package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDao {
    public Connection con = null;
    private String sql = null;
    
    public ConectarDao () {
        String strcon = "jdbc:mysql://localhost:3306/PataDigital";//cria a string de conexão ao servidor xaamp 
        try {

        con = DriverManager.getConnection(strcon, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }
    
    public void criarBanco(){
        this.criarTabelaRaca();
        this.criarTabelaCliente();
        this.criarTabelaFuncionario();
        this.criarTabelaEndereco();
        this.criarTabelaProduto();
        this.criarTabelaFormaPagamento();
        this.criarTabelaServico();
        this.criarTabelaPet();
        this.criarTabelaVenda();
        this.criarTabelaAtendimento();
        this.criarTabelaVendaProduto();
        this.criarTabelaAtendimentoServico();
        
    }
    
    private void criarTabelaServico() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_SERVICO`(" +
                    "    `ID_SERVICO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_NOME` VARCHAR(255) NOT NULL," +
                    "    `DS_SERVICO` VARCHAR(255) NOT NULL," +
                    "    `VL_SERVICO` DECIMAL(8, 2) NOT NULL," +
                    "    `TG_INATIVO` TINYINT(1) NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaAtendimento() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_ATENDIMENTO`(" +
                    "    `ID_AGENDAMENTO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `FK_PET` INT NOT NULL," +
                    "    `FK_CLIENTE` INT NOT NULL," +
                    "    `FK_FUNCIONARIO` INT NOT NULL," +
                    "    `FK_FORMA_PAGAMENTO` INT NOT NULL," +
                    "    `VL_TOTAL` DECIMAL(8, 2) NOT NULL," +
                    "    `DH_ATENDIMENTO` DATETIME NOT NULL," +
                    "    `DS_CANCELAMENTO` VARCHAR(255) NULL"+
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    } 

    private void criarTabelaVendaProduto() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_VENDA_PRODUTO`(" +
                    "    `ID_VENDA_PRODUTO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `FK_PRODUTO` INT NOT NULL," +
                    "    `FK_VENDA` INT NOT NULL," +
                    "    `QT_PRODUTO` INT NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaRaca() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_RACA`(" +
                    "    `ID_RACA` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_RACA` VARCHAR(255) NOT NULL," +
                    "    `TG_INATIVO` TINYINT(1) NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaEndereco() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_ENDERECO`(" +
                    "    `ID_ENDERECO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_LOGRADOURO` VARCHAR(255) NOT NULL," +
                    "    `DS_BAIRRO` VARCHAR(255) NOT NULL," +
                    "    `DS_NUMERO` VARCHAR(255) NOT NULL," +
                    "    `DS_COMPLEMENTO` VARCHAR(255) NULL," +
                    "    `DS_CEP` VARCHAR(255) NOT NULL," +
                    "    `DS_CIDADE` VARCHAR(255) NOT NULL," +
                    "    `DS_ESTADO` VARCHAR(255) NOT NULL," +
                    "    `DS_PAIS` VARCHAR(255) NOT NULL," +
                    "    `DS_UF` VARCHAR(255) NOT NULL," +
                    "    `FK_CLIENTE` INT NULL," +
                    "    `FK_FUNCIONARIO` INT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();            
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaProduto() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_PRODUTO`(" +
                    "    `ID_PRODUTO` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_PRODUTO` VARCHAR(255) NOT NULL," +
                    "    `DS_NOME` VARCHAR(255) NOT NULL," +
                    "    `VL_PRODUTO` DECIMAL(8, 2) NOT NULL," +
                    "    `TG_INATIVO` TINYINT(1) NOT NULL," +
                    "    `QT_PRODUTO` INT NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaVenda() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_VENDA`(" +
                    "    `ID_VENDA` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `FK_FUNCIONARIO` INT NOT NULL," +
                    "    `FK_FORMA_PAGAMENTO` INT NOT NULL," +
                    "    `FK_CLIENTE` INT NOT NULL," +
                    "    `VL_TOTAL` DECIMAL(8, 2) NOT NULL," +
                    "    `DH_VENDA` DATETIME NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaFormaPagamento() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_FORMA_PAGAMENTO`(" +
                    "    `ID_FORMA_PAGAMENTO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_FORMA_PAGAMENTO` VARCHAR(255) NOT NULL," +
                    "    `TG_INATIVO` TINYINT(1) NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaCliente() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_CLIENTE`(" +
                    "    `ID_CLIENTE` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_NOME` VARCHAR(255) NOT NULL," +
                    "    `DS_CPF` VARCHAR(255) NOT NULL," +
                    "    `DT_NASCIMENTO` DATE NOT NULL," +
                    "    `DS_CELULAR` VARCHAR(255) NOT NULL," +
                    "    `DS_TELEFONE` VARCHAR(255) NOT NULL," +
                    "    `DS_EMAIL` VARCHAR(255) NOT NULL," +
                    "    `DS_SENHA` VARCHAR(255) NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaFuncionario() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_FUNCIONARIO`(" +
                    "    `ID_FUNCIONARIO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_NOME` VARCHAR(255) NOT NULL," +
                    "    `DS_CPF` VARCHAR(255) NOT NULL," +
                    "    `TG_INATIVO` TINYINT(1) NOT NULL," +
                    "    `DS_CELULAR` VARCHAR(255) NOT NULL," +
                    "    `DS_TELEFONE` VARCHAR(255) NOT NULL," +
                    "    `DS_EMAIL` VARCHAR(255) NOT NULL," +
                    "    `DS_LOGIN` VARCHAR(255) NOT NULL," +
                    "    `DS_SENHA` VARCHAR(255) NOT NULL," +
                    "    `DS_PERMISAO` VARCHAR(255) NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    private void criarTabelaAtendimentoServico() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_ATENDIMENTO_SERVICO`(" +
                    "    `ID_ATENDIMENTO_SERVICO` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `FK_ATENDIMENTO` INT NOT NULL," +
                    "    `FK_SERVICO` INT NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
    
    
    private void criarTabelaPet() {
        try { 
            sql = "CREATE TABLE IF NOT EXISTS `TB_PET`(" +
                    "    `ID_PET` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "    `DS_NOME` VARCHAR(255) NOT NULL," +
                    "    `DT_NASCIMENTO` DATE NULL," +
                    "    `FK_RACA` INT NOT NULL," +
                    "    `FK_CLIENTE` INT NOT NULL" +
                    ");";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
        }
    }
}
