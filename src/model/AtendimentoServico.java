
package model;


public class AtendimentoServico {
    private int ID_ATENDIMENTO_SERVICO;
    private int FK_ATENDIMENTO;
    private int FK_SERVICO;

    public int getID_ATENDIMENTO_SERVICO() {
        return ID_ATENDIMENTO_SERVICO;
    }

    public void setID_ATENDIMENTO_SERVICO(int ID_ATENDIMENTO_SERVICO) {
        this.ID_ATENDIMENTO_SERVICO = ID_ATENDIMENTO_SERVICO;
    }

    public int getFK_ATENDIMENTO() {
        return FK_ATENDIMENTO;
    }

    public void setFK_ATENDIMENTO(int FK_ATENDIMENTO) {
        this.FK_ATENDIMENTO = FK_ATENDIMENTO;
    }

    public int getFK_SERVICO() {
        return FK_SERVICO;
    }

    public void setFK_SERVICO(int FK_SERVICO) {
        this.FK_SERVICO = FK_SERVICO;
    }
    
}
