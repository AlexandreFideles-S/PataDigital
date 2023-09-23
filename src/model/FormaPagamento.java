
package model;

public class FormaPagamento {
     private int ID_FORMA_PAGAMENTO;
    private String DS_FORMA_PAGAMENTO;
    private boolean TG_INATIVO;

    public int getID_FORMA_PAGAMENTO() {
        return ID_FORMA_PAGAMENTO;
    }

    public void setID_FORMA_PAGAMENTO(int ID_FORMA_PAGAMENTO) {
        this.ID_FORMA_PAGAMENTO = ID_FORMA_PAGAMENTO;
    }

    public String getDS_FORMA_PAGAMENTO() {
        return DS_FORMA_PAGAMENTO;
    }

    public void setDS_FORMA_PAGAMENTO(String DS_FORMA_PAGAMENTO) {
        this.DS_FORMA_PAGAMENTO = DS_FORMA_PAGAMENTO;
    }

    public boolean isTG_INATIVO() {
        return TG_INATIVO;
    }

    public void setTG_INATIVO(boolean TG_INATIVO) {
        this.TG_INATIVO = TG_INATIVO;
    }
    
}
