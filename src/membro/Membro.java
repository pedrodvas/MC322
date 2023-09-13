package membro;
import multimidia.LivroFisico;
import multimidia.CD;
import multimidia.DVD;
import java.util.List;

public class Membro{
    private String nome;
    private String cpf;
    private List<LivroFisico> livrosEmprestados;
    private List<CD> cdsEmprestados;
    private List<DVD> dvdsEmprestados;

    public Membro(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public boolean ehEstudante(){
        return false;
    }

    public boolean ehProfessor(){
        return false;
    }

    public void emprestaLivro(LivroFisico livro){
        if (livro.getDisponibilidade() == true){
            livrosEmprestados.add(livro);
            livro.emprestaItem();
            System.out.println("Livro" + livro.getTitulo() + "emprestado com sucesso!");
        }
        else{
            System.out.println("O livro esta indisponivel!");
        }
    }

    public void devolveLivro(LivroFisico livro){
        if (livrosEmprestados.contains(livro)){
            livrosEmprestados.remove(livro);
            livro.devolveItem();  
            System.out.println("Livro " + livro.getTitulo() + "devolvido com sucesso!");
        }
        else {
            System.out.println("Voce nao emprestou esse livro.");
        }
    }

    public void emprestaCD(CD CD){
        if (CD.getDisponibilidade() == true){
            cdsEmprestados.add(CD);
            CD.emprestaItem();
            System.out.println("CD " + CD.getTitulo() + " emprestado com sucesso!");
        }
        else{
            System.out.println("O CD nao esta disponivel!");
        }
    }

    public void devolveCD(CD CD){
        if (cdsEmprestados.contains(CD)){
            cdsEmprestados.remove(CD);
            CD.devolveItem();
            System.out.println("CD " + CD.getTitulo() + " devolvido com sucesso!");
        }
        else{
            System.out.println("Voce nao emprestou este CD.");
        }
    }

    public void emprestaDVD(DVD DVD){
        if (DVD.getDisponibilidade() == true){
            dvdsEmprestados.add(DVD);
            DVD.emprestaItem();
            System.out.println("DVD" + DVD.getTitulo() + " emprestado com sucesso!");
        }
        else{
            System.out.println("O DVD nao esta disponivel!");
        }
    }

    public void devolveDVD(DVD DVD){
        if (dvdsEmprestados.contains(DVD)){
            dvdsEmprestados.remove(DVD);
            DVD.devolveItem();
            System.out.println("DVD " + DVD.getTitulo() + " devolvido com sucesso!");
        }
        else{
            System.out.println("Voce nao emprestou este DVD.");
        }
    }
}
