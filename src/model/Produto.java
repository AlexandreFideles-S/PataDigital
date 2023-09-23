
package model;

public class Produto {
    private long ID_PRODUTO;
    private String DS_PRODUTO;
    private String DS_NOME;
    private double VL_PRODUTO;
    private boolean TG_INATIVO;
    private int QT_PRODUTO;

    public long getID_PRODUTO() {
        return ID_PRODUTO;
    }

    public void setID_PRODUTO(long ID_PRODUTO) {
        this.ID_PRODUTO = ID_PRODUTO;
    }

    public String getDS_PRODUTO() {
        return DS_PRODUTO;
    }

    public void setDS_PRODUTO(String DS_PRODUTO) {
        this.DS_PRODUTO = DS_PRODUTO;
    }

    public String getDS_NOME() {
        return DS_NOME;
    }

    public void setDS_NOME(String DS_NOME) {
        this.DS_NOME = DS_NOME;
    }

    public double getVL_PRODUTO() {
        return VL_PRODUTO;
    }

    public void setVL_PRODUTO(double VL_PRODUTO) {
        this.VL_PRODUTO = VL_PRODUTO;
    }

    public boolean isTG_INATIVO() {
        return TG_INATIVO;
    }

    public void setTG_INATIVO(boolean TG_INATIVO) {
        this.TG_INATIVO = TG_INATIVO;
    }

    public int getQT_PRODUTO() {
        return QT_PRODUTO;
    }

    public void setQT_PRODUTO(int QT_PRODUTO) {
        this.QT_PRODUTO = QT_PRODUTO;
    }
    
}
