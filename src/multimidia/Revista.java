package multimidia;

public class Revista extends ItemBiblioteca{
    private String titulo;
    private String edição;
    private int ano;

    public Revista(String titulo,String edição, int ano) {
        super(titulo);
        this.edição = edição;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicao() {
        return edição;
    }

    public int getAno() {
        return ano;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEdicao(String edição) {
        this.edição = edição;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
