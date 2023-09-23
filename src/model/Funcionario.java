
package model;

public class Funcionario {
    private int ID_FUNCIONARIO;
    private String DS_NOME;
    private String DS_CPF;
    private boolean TG_INATIVO;
    private String DS_CELULAR;
    private String DS_TELEFONE;
    private int FK_ENDERECO;
    private String DS_EMAIL;
    private String DS_LOGIN;
    private String DS_SENHA;
    private String DS_PERMISSAO;

    public int getID_FUNCIONARIO() {
        return ID_FUNCIONARIO;
    }

    public void setID_FUNCIONARIO(int ID_FUNCIONARIO) {
        this.ID_FUNCIONARIO = ID_FUNCIONARIO;
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

    public boolean isTG_INATIVO() {
        return TG_INATIVO;
    }

    public void setTG_INATIVO(boolean TG_INATIVO) {
        this.TG_INATIVO = TG_INATIVO;
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

    public int getFK_ENDERECO() {
        return FK_ENDERECO;
    }

    public void setFK_ENDERECO(int FK_ENDERECO) {
        this.FK_ENDERECO = FK_ENDERECO;
    }

    public String getDS_EMAIL() {
        return DS_EMAIL;
    }

    public void setDS_EMAIL(String DS_EMAIL) {
        this.DS_EMAIL = DS_EMAIL;
    }

    public String getDS_LOGIN() {
        return DS_LOGIN;
    }

    public void setDS_LOGIN(String DS_LOGIN) {
        this.DS_LOGIN = DS_LOGIN;
    }

    public String getDS_SENHA() {
        return DS_SENHA;
    }

    public void setDS_SENHA(String DS_SENHA) {
        this.DS_SENHA = DS_SENHA;
    }

    public String getDS_PERMISSAO() {
        return DS_PERMISSAO;
    }

    public void setDS_PERMISSAO(String DS_PERMISSAO) {
        this.DS_PERMISSAO = DS_PERMISSAO;
    }
    
}
