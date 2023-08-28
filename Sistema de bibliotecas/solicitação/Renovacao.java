package solicitação;
import emprestimo.Emprestimo;
import membro.Membro;
import java.time.LocalDate;

//renovação é uma composição dos componentes acima


public class Renovacao {
    private Emprestimo emprestimo;
    private Membro membro;
    private LocalDate dataRenovacao;

    public Renovacao(Emprestimo emprestimo, Membro membro, LocalDate dataRenovacao){
        this.emprestimo = emprestimo;
        this.membro = membro;
        this.dataRenovacao = dataRenovacao;
    }

    public Emprestimo getEmprestimo(){
        return emprestimo;
    }

    public Membro getMembro(){
        return membro;
    }

    public LocalDate getDataRenovacao(){
        return dataRenovacao;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public void setmembro(Membro membro){
        this.membro = membro;
    }

    public void setDataRenovacao(LocalDate dataRenovacao){
        this.dataRenovacao = dataRenovacao;
    }

    public void adiaDataDevolucao(LocalDate novaData, Emprestimo emprestimo){
        emprestimo.setDiaDevolucao(novaData);
    }
}
