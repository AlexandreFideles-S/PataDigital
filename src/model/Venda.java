
package model;

import java.util.Date;

public class Venda {
    private int ID_VENDA;
    private int FK_FUNCIONARIO;
    private int FK_FORMA_PAGAMENTO;
    private int FK_CLIENTE;
    private double VL_TOTAL;
    private Date DH_VENDA;

    public int getID_VENDA() {
        return ID_VENDA;
    }

    public void setID_VENDA(int ID_VENDA) {
        this.ID_VENDA = ID_VENDA;
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

    public int getFK_CLIENTE() {
        return FK_CLIENTE;
    }

    public void setFK_CLIENTE(int FK_CLIENTE) {
        this.FK_CLIENTE = FK_CLIENTE;
    }

    public double getVL_TOTAL() {
        return VL_TOTAL;
    }

    public void setVL_TOTAL(double VL_TOTAL) {
        this.VL_TOTAL = VL_TOTAL;
    }

    public Date getDH_VENDA() {
        return DH_VENDA;
    }

    public void setDH_VENDA(Date DH_VENDA) {
        this.DH_VENDA = DH_VENDA;
    }
}
