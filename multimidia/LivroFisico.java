package multimidia;

public class LivroFisico extends ItemBiblioteca{
    private String autor;
    private String registro; //Serve para diferenciarmos dois livros iguais

    public LivroFisico(String titulo, String autor, String registro){
        super(titulo);
        this.autor = autor;
        this.registro = registro;
    }

    public String getAutor(){
        return autor;
    }

    public String getRegistro(){
        return registro;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }

    public boolean ehLivro(){
        return true;
    }
}