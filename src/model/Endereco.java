package model;

public class Endereco {
    private int ID_ENDERECO;
    private String DS_LOGRADOURO;
    private String DS_BAIRRO;
    private String DS_NUMERO;
    private String DS_COMPLEMENTO;
    private String DS_CEP;
    private String DS_CIDADE;
    private String DS_ESTADO;
    private String DS_PAIS;
    private String DS_UF;
    private int FK_CLIENTE;
    private int FK_FUNCIONARIO;

    public int getID_ENDERECO() {
        return ID_ENDERECO;
    }

    public void setID_ENDERECO(int ID_ENDERECO) {
        this.ID_ENDERECO = ID_ENDERECO;
    }

    public String getDS_LOGRADOURO() {
        return DS_LOGRADOURO;
    }

    public void setDS_LOGRADOURO(String DS_LOGRADOURO) {
        this.DS_LOGRADOURO = DS_LOGRADOURO;
    }

    public String getDS_BAIRRO() {
        return DS_BAIRRO;
    }

    public void setDS_BAIRRO(String DS_BAIRRO) {
        this.DS_BAIRRO = DS_BAIRRO;
    }

    public String getDS_NUMERO() {
        return DS_NUMERO;
    }

    public void setDS_NUMERO(String DS_NUMERO) {
        this.DS_NUMERO = DS_NUMERO;
    }

    public String getDS_COMPLEMENTO() {
        return DS_COMPLEMENTO;
    }

    public void setDS_COMPLEMENTO(String DS_COMPLEMENTO) {
        this.DS_COMPLEMENTO = DS_COMPLEMENTO;
    }

    public String getDS_CEP() {
        return DS_CEP;
    }

    public void setDS_CEP(String DS_CEP) {
        this.DS_CEP = DS_CEP;
    }

    public String getDS_CIDADE() {
        return DS_CIDADE;
    }

    public void setDS_CIDADE(String DS_CIDADE) {
        this.DS_CIDADE = DS_CIDADE;
    }

    public String getDS_ESTADO() {
        return DS_ESTADO;
    }

    public void setDS_ESTADO(String DS_ESTADO) {
        this.DS_ESTADO = DS_ESTADO;
    }

    public String getDS_PAIS() {
        return DS_PAIS;
    }

    public void setDS_PAIS(String DS_PAIS) {
        this.DS_PAIS = DS_PAIS;
    }

    public String getDS_UF() {
        return DS_UF;
    }

    public void setDS_UF(String DS_UF) {
        this.DS_UF = DS_UF;
    }
    
    public int getFK_CLIENTE() {
        return FK_CLIENTE;
    }

    public void setFK_CLIENTE(int FK_CLIENTE) {
        this.FK_CLIENTE = FK_CLIENTE;
    }
    
    public int getFK_FUNCIONARIO() {
        return FK_FUNCIONARIO;
    }

    public void setFK_FUNCIONARIO(int FK_FUNCIONARIO) {
        this.FK_FUNCIONARIO = FK_FUNCIONARIO;
    }
}
