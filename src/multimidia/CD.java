package multimidia;
import java.util.ArrayList;
import java.util.List;

public class CD extends ItemBiblioteca{
/*Esta classe ira representar um CD de audio presente na biblioteca */
    private String artista;
    private String registro; //Para diferenciarmos dois CDs iguais
    private int numeroFaixas; //Guarda a quantidade de faixas disponiveis 
    private boolean disponibilidade;
    private List<String> faixas;
    private int minutosDuração;
    private int numeroCopias;
    private int copiasDisponiveis;
    private String estadoConservação;

    public CD(String titulo, String artista, String registro, int numeroFaixas, boolean disponibilidade, 
              int minutosDuração, int numeroCopias, String estadoConservação) {
        super(titulo);
        this.artista = artista;
        this.registro = registro;
        this.numeroFaixas = numeroFaixas;
        this.disponibilidade = disponibilidade;
        this.faixas = new ArrayList<>();
        this.minutosDuração = minutosDuração;
        this.numeroCopias = numeroCopias;
        this.copiasDisponiveis = numeroCopias;
        this.estadoConservação = estadoConservação;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
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

    public boolean ehCD(){
        return true;
    }
}