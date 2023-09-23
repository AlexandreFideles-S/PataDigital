
package model;


public class VendaProduto {
    private int ID_VENDA_PRODUTO;
    private int FK_PRODUTO;
    private int FK_VENDA;
    private int QT_PRODUTO;

    public int getID_VENDA_PRODUTO() {
        return ID_VENDA_PRODUTO;
    }

    public void setID_VENDA_PRODUTO(int ID_VENDA_PRODUTO) {
        this.ID_VENDA_PRODUTO = ID_VENDA_PRODUTO;
    }

    public int getFK_PRODUTO() {
        return FK_PRODUTO;
    }

    public void setFK_PRODUTO(int FK_PRODUTO) {
        this.FK_PRODUTO = FK_PRODUTO;
    }

    public int getFK_VENDA() {
        return FK_VENDA;
    }

    public void setFK_VENDA(int FK_VENDA) {
        this.FK_VENDA = FK_VENDA;
    }

    public int getQT_PRODUTO() {
        return QT_PRODUTO;
    }

    public void setQT_PRODUTO(int QT_PRODUTO) {
        this.QT_PRODUTO = QT_PRODUTO;
    }
    
}
