package multimidia;

public class ItemBiblioteca {
/*Essa classe sera responsavel por administrar os itens fisicos da biblioteca que podem
 * ser emprestados (livros fisicos, CDs e DVDs).
 */
    private String titulo;
    private boolean disponibilidade = true;

    public ItemBiblioteca(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }

    public void emprestaItem(){
        disponibilidade = false;
    }

    public void devolveItem(){
        disponibilidade = true;
    }

    public boolean ehLivro(){
        return false;
    }

    public boolean ehCD(){
        return false;
    }

    public boolean ehDVD(){
        return false;
    }
}
