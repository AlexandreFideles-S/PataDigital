
package model;

import java.util.Date;


public class Atendimento {
    private int ID_AGENDAMENTO;
    private int FK_PET;
    private int FK_CLIENTE;
    private int FK_FUNCIONARIO;
    private int FK_FORMA_PAGAMENTO;
    private double VL_TOTAL;
    private Date DH_ATENDIMENTO;
    private String DS_CANCELAMENTO;

    public int getID_AGENDAMENTO() {
        return ID_AGENDAMENTO;
    }

    public void setID_AGENDAMENTO(int ID_AGENDAMENTO) {
        this.ID_AGENDAMENTO = ID_AGENDAMENTO;
    }

    public int getFK_PET() {
        return FK_PET;
    }

    public void setFK_PET(int FK_PET) {
        this.FK_PET = FK_PET;
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

    public int getFK_FORMA_PAGAMENTO() {
        return FK_FORMA_PAGAMENTO;
    }

    public void setFK_FORMA_PAGAMENTO(int FK_FORMA_PAGAMENTO) {
        this.FK_FORMA_PAGAMENTO = FK_FORMA_PAGAMENTO;
    }

    public double getVL_TOTAL() {
        return VL_TOTAL;
    }

    public void setVL_TOTAL(double VL_TOTAL) {
        this.VL_TOTAL = VL_TOTAL;
    }

    public Date getDH_ATENDIMENTO() {
        return DH_ATENDIMENTO;
    }

    public void setDH_ATENDIMENTO(Date DH_ATENDIMENTO) {
        this.DH_ATENDIMENTO = DH_ATENDIMENTO;
    }

    public String getDS_CANCELAMENTO() {
        return DS_CANCELAMENTO;
    }

    public void setDS_CANCELAMENTO(String DS_CANCELAMENTO) {
        this.DS_CANCELAMENTO = DS_CANCELAMENTO;
    }
    
}
