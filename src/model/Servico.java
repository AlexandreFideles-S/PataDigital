/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joao.vmsouza17
 */
public class Servico {
    private int ID_SERVICO;
    private String DS_NOME;
    private String DS_SERVICO;
    private double VL_SERVICO;
    private boolean TG_INATIVO;

    public int getID_SERVICO() {
        return ID_SERVICO;
    }

    public void setID_SERVICO(int ID_SERVICO) {
        this.ID_SERVICO = ID_SERVICO;
    }

    public String getDS_NOME() {
        return DS_NOME;
    }

    public void setDS_NOME(String DS_NOME) {
        this.DS_NOME = DS_NOME;
    }

    public String getDS_SERVICO() {
        return DS_SERVICO;
    }

    public void setDS_SERVICO(String DS_SERVICO) {
        this.DS_SERVICO = DS_SERVICO;
    }

    public double getVL_SERVICO() {
        return VL_SERVICO;
    }

    public void setVL_SERVICO(double VL_SERVICO) {
        this.VL_SERVICO = VL_SERVICO;
    }

    public boolean isTG_INATIVO() {
        return TG_INATIVO;
    }

    public void setTG_INATIVO(boolean TG_INATIVO) {
        this.TG_INATIVO = TG_INATIVO;
    }
    
    
}
