package relatorio;
import java.time.LocalDate;
import java.util.List;
import emprestimo.Emprestimo;
import solicitação.Renovacao;
import solicitação.Reserva;

//relatório é uma agregação dos componentes acima

public class Relatorio {
    private List<Emprestimo> emprestimosDoDia;
    private List<Renovacao> renovacoesDoDia;
    private List<Reserva> reservasDoDia;
    private LocalDate dataRelatorio;

    public Relatorio(List<Emprestimo> emprestimosDoDia, List<Renovacao> renovacoesDoDia, List<Reserva> reservasDoDia){
        this.dataRelatorio = dataRelatorio;
    }

    public LocalDate getDataRelatorio(){
        return dataRelatorio;
    }

    public void adicionarEmprestimo(Emprestimo novoEmprestimo) {
        emprestimosDoDia.add(novoEmprestimo);
    }

    public void adicionarRenovacao(Renovacao novaRenovacao){
        renovacoesDoDia.add(novaRenovacao);
    }

    public void adicionarReserva(Reserva novaReserva){
        reservasDoDia.add(novaReserva);
    }

    public void setData(LocalDate diaAtual){
        this.dataRelatorio = diaAtual;
    }

}