package multimidia;
import java.time.LocalDate;

public class LivroDigital extends ItemBiblioteca{
/*Para um ebook, nao faz sentido falarmos em disponibilidade que nem um livro fisico,
visto que, por ser virtual, ele sempre estara disponivel para ser visualizado */    
    private String titulo;
    private String autor;
    private String registro;
    private String formato; //Para sabermos se eh um PDF, EPUB, etc
    private double tamanhoMB; // Para sabermos o tamanho do livro em megabytes
    private int licenças;
    private String local;
    private String requisitos;
    private LocalDate dataDisponibilidade;

    public LivroDigital(String titulo, String autor, String registro, String formato, double tamanhoMB, int licenças, String local, String requisitos, LocalDate dataDisponibilidade) {
        super(titulo);
        this.autor = autor;
        this.registro = registro;
        this.formato = formato;
        this.tamanhoMB = tamanhoMB;
        this.licenças = licenças;
        this.local = local;
        this.requisitos = requisitos;
        this.dataDisponibilidade = dataDisponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }

    public void setTamanhoMB(double tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }

    public int getLicenças() {
        return licenças;
    }

    public void setLicenças(int licenças) {
        this.licenças = licenças;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public LocalDate getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(LocalDate dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }

    public void acessaLivroDigital(){
        System.out.println("Voce agora esta lendo o livro " + getTitulo());
    }
}