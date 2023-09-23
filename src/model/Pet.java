
package model;

import java.util.Date;

public class Pet {
    private int ID_PET;
    private String DS_NOME;
    private Date DT_NASCIMENTO;
    private int FK_RACA;
    private int FK_CLIENTE;

    public int getID_PET() {
        return ID_PET;
    }

    public void setID_PET(int ID_PET) {
        this.ID_PET = ID_PET;
    }

    public String getDS_NOME() {
        return DS_NOME;
    }

    public void setDS_NOME(String DS_NOME) {
        this.DS_NOME = DS_NOME;
    }

    public Date getDT_NASCIMENTO() {
        return DT_NASCIMENTO;
    }

    public void setDT_NASCIMENTO(Date DT_NASCIMENTO) {
        this.DT_NASCIMENTO = DT_NASCIMENTO;
    }

    public int getFK_RACA() {
        return FK_RACA;
    }

    public void setFK_RACA(int FK_RACA) {
        this.FK_RACA = FK_RACA;
    }

    public int getFK_CLIENTE() {
        return FK_CLIENTE;
    }

    public void setFK_CLIENTE(int FK_CLIENTE) {
        this.FK_CLIENTE = FK_CLIENTE;
    }
    
}
