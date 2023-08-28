package solicitação;
import emprestimo.Emprestimo;
import membro.Membro;
import java.time.LocalDate;

//reserva é uma composição dos componentes acima

public class Reserva {
    private Emprestimo emprestimoAnterior;
    private Membro proximoMembro; //Membro que solicitou a reserva
    private LocalDate dataRequisicao;

    public Reserva(Emprestimo emprestimoAnterior, Membro proximoMembro, LocalDate dataRequisicao){
        this.emprestimoAnterior = emprestimoAnterior;
        this.proximoMembro = proximoMembro;
        this.dataRequisicao = dataRequisicao;
    }

    public Emprestimo getEmprestimo(){
        return emprestimoAnterior;
    }

    public Membro getMembro(){
        return proximoMembro;
    }

    public LocalDate getDataRequisicao(){
        return dataRequisicao;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimoAnterior = emprestimo;
    }

    public void setMembro(Membro proximoMembro){
        this.proximoMembro = proximoMembro;
    }

    public void setDataRequisicao(LocalDate dataRequisicao){
        this.dataRequisicao = dataRequisicao;
    }
}