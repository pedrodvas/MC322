import java.util.ArrayList;
import java.util.List;

class Livro {
    //Atributos da classe
    private String titulo;
    private String autor;
    private String editora;
    private String registro;
    protected boolean disponibilidade = true;
    //Construcao da classe
    public Livro(String titulo, String autor, String editora, String registro){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.registro = registro;
    }
    //Getters and setters
    public String get_titulo(){
        return titulo;
    }
    public void set_titulo(String titulo){
        this.titulo = titulo;
    }
    public String get_autor(){
        return autor;
    }
    public void set_autor(String autor){
        this.autor = autor;
    }
    public String get_editora(){
        return editora;
    }
    public void set_editora(String editora){
        this.editora = editora;
    }
    public String get_registro(){
        return registro;
    }
    public void set_registro(String registro){
        this.registro = registro;
    }

    protected void empresta_livro(){
        disponibilidade = false;
    }

    protected boolean verifica_disponibilidade(){
        return disponibilidade;
    }
}

class Funcionario {
    //Atributos da classe
    private String nome;
    protected String usuario;
    protected String senha;
    //Construcao da classe
    Funcionario(String nome, String usuario, String senha){
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    //Getters and setters
    public String get_nome(){
        return nome;
    }

}

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }
}