package multimidia;

public class LivroDigital{
/*Para um ebook, nao faz sentido falarmos em disponibilidade que nem um livro fisico,
visto que, por ser virtual, ele sempre estara disponivel para ser visualizado */    
    private String titulo;
    private String autor;
    private String registro;
    private String formato; //Para sabermos se eh um PDF, EPUB, etc
    private double tamanhoMB; // Para sabermos o tamanho do livro em megabytes

    public LivroDigital(String titulo, String autor, String registro, String formato, double tamanhoMB){
        this.titulo = titulo;
        this.autor = autor;
        this.registro = registro;
        this.formato = formato;
        this.tamanhoMB = tamanhoMB;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public String getRegistro(){
        return registro;
    }

    public String getFormato(){
        return formato;
    }

    public double getTamanhoMB(){
        return tamanhoMB;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }

    public void setTamanhoMB(double tamanhoMB){
        this.tamanhoMB = tamanhoMB;
    }

    public void acessaLivroDigital(){
        System.out.println("Voce agora esta lendo o livro " + getTitulo());
    }
}