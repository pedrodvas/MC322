package multimidia;
import java.util.ArrayList;
import java.util.List;

public class DVD extends ItemBiblioteca{
/*Essa classe ira representar um DVD de video presente na biblioteca */
    private String diretor;
    public String registro; //Aqui temos um registro para diferenciar dois DVDs iguais
    private int duracao; //Aqui guardamos o tempo de duracao do DVD em minutos
    private boolean disponibilidade;
    private List<String> elenco;
    private int minutosDuração;
    private int numeroCopias;
    private int copiasDisponiveis;
    private String estadoConservação;

    public DVD(String titulo, String diretor, String registro, int duracao, boolean disponibilidade,
               int minutosDuração, int numeroCopias, String estadoConservação) {
        super(titulo);
        this.diretor = diretor;
        this.registro = registro;
        this.duracao = duracao;
        this.disponibilidade = disponibilidade;
        this.elenco = new ArrayList<>();
        this.minutosDuração = minutosDuração;
        this.numeroCopias = numeroCopias;
        this.copiasDisponiveis = numeroCopias;
        this.estadoConservação = estadoConservação;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public int getMinutosDuração() {
        return minutosDuração;
    }

    public void setMinutosDuração(int minutosDuração) {
        this.minutosDuração = minutosDuração;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getEstadoConservação() {
        return estadoConservação;
    }

    public void setEstadoConservação(String estadoConservação) {
        this.estadoConservação = estadoConservação;
    }
}
