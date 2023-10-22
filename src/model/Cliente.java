
package model;
import java.util.Date;

public class Cliente {
    private int ID_CLIENTE;
    private String DS_NOME;
    private String DS_CPF;
    private Date DT_NASCIMENTO;
    private String DS_CELULAR;
    private String DS_TELEFONE;
    private String DS_EMAIL;
    private String DS_SENHA;
    private Endereco Endereco;

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getDS_NOME() {
        return DS_NOME;
    }

    public void setDS_NOME(String DS_NOME) {
        this.DS_NOME = DS_NOME;
    }

    public String getDS_CPF() {
        return DS_CPF;
    }

    public void setDS_CPF(String DS_CPF) {
        this.DS_CPF = DS_CPF;
    }

    public Date getDT_NASCIMENTO() {
        return DT_NASCIMENTO;
    }

    public void setDT_NASCIMENTO(Date DT_NASCIMENTO) {
        this.DT_NASCIMENTO = DT_NASCIMENTO;
    }

    public String getDS_CELULAR() {
        return DS_CELULAR;
    }

    public void setDS_CELULAR(String DS_CELULAR) {
        this.DS_CELULAR = DS_CELULAR;
    }

    public String getDS_TELEFONE() {
        return DS_TELEFONE;
    }

    public void setDS_TELEFONE(String DS_TELEFONE) {
        this.DS_TELEFONE = DS_TELEFONE;
    }

    public String getDS_EMAIL() {
        return DS_EMAIL;
    }

    public void setDS_EMAIL(String DS_EMAIL) {
        this.DS_EMAIL = DS_EMAIL;
    }

    public String getDS_SENHA() {
        return DS_SENHA;
    }

    public void setDS_SENHA(String DS_SENHA) {
        this.DS_SENHA = DS_SENHA;
    }
    
    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }
}
