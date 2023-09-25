package multimidia;

public class LivroFisico extends ItemBiblioteca{
    private String autor;
    private String registro;
    private String ISBN;
    private String edição;
    private int numeroCopias;
    private String localização;
    private String estadoConservação;

    public LivroFisico(String titulo, String autor, String registro, String ISBN, String edição, int numeroCopias, String localização, String estadoConservação) {
        super(titulo);
        this.autor = autor;
        this.registro = registro;
        this.ISBN = ISBN;
        this.edição = edição;
        this.numeroCopias = numeroCopias;
        this.localização = localização;
        this.estadoConservação = estadoConservação;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdição() {
        return edição;
    }

    public void setEdição(String edição) {
        this.edição = edição;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public String getEstadoConservação() {
        return estadoConservação;
    }

    public void setEstadoConservação(String estadoUso) {
        this.estadoConservação = estadoUso;
    }

    public boolean ehLivro(){
        return true;
    }
}