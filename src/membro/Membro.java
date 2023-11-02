package membro;
import multimidia.LivroFisico;
import multimidia.OutrasMidias;
import multimidia.CD;
import multimidia.DVD;
import multimidia.LivroDigital;

import java.util.List;

public class Membro{
    private String nome;
    private String cpf;
    public boolean multa; 
    private int emprestimosAtuais; // Vamos considerar o limite maximo de emprestimos igual a 5 itens quaisquer da biblioteca
    private List<LivroFisico> livrosFisicosEmprestados;
    private List<LivroDigital> livrosDigitaisEmprestados;
    private List<CD> cdsEmprestados;
    private List<DVD> dvdsEmprestados;
    private List<OutrasMidias> outrasMidiasEmprestadas;

    public Membro(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.emprestimosAtuais = 0;
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

    public boolean temMulta(){
        return multa;
    }

    public boolean podeEmprestar(){
        return emprestimosAtuais < 5; // Limite maximo de emprestimos
    }

    public void pagaMulta(){
        this.multa = false;
    }

    public void adicionaMulta(){
        this.multa = true;
    }

    public void emprestaLivroFisico(LivroFisico livro){
        if (livro.getDisponibilidade() == true){
            if (podeEmprestar()){
                livrosFisicosEmprestados.add(livro);
                livro.emprestaItem();
                System.out.println("Livro" + livro.getTitulo() + "emprestado com sucesso!");    
            }
            else{
                System.out.println("Voce ja excedeu o limite de emprestimos!");
            }
        }
        else{
            System.out.println("O livro esta indisponivel!");
        }
    }

    public void devolveLivroFisico(LivroFisico livro){
        if (livrosFisicosEmprestados.contains(livro)){
            livrosFisicosEmprestados.remove(livro);
            livro.devolveItem();  
            System.out.println("Livro " + livro.getTitulo() + "devolvido com sucesso!");
        }
        else {
            System.out.println("Voce nao emprestou esse livro.");
        }
    }

     public void emprestaLivroDigital(LivroDigital livro){
        if (livro.getDisponibilidade() == true){
            if (podeEmprestar()){
                livrosDigitaisEmprestados.add(livro);
                livro.emprestaItem();
                System.out.println("Livro" + livro.getTitulo() + "emprestado com sucesso!");
            }
            else{
                System.out.println("Voce ja excedeu o limite de emprestimos!");
            }
        }
        else{
            System.out.println("O livro esta indisponivel!");
        }
    }

    public void devolveLivroDigital(LivroDigital livro){
        if (livrosDigitaisEmprestados.contains(livro)){
            livrosDigitaisEmprestados.remove(livro);
            livro.devolveItem();  
            System.out.println("Livro " + livro.getTitulo() + "devolvido com sucesso!");
        }
        else {
            System.out.println("Voce nao emprestou esse livro.");
        }
    }

    public void emprestaCD(CD CD){
        if (CD.getDisponibilidade() == true){
            if (podeEmprestar()){
                cdsEmprestados.add(CD);
                CD.emprestaItem();
                System.out.println("CD " + CD.getTitulo() + " emprestado com sucesso!");
            }
            else{
                System.out.println("Voce ja excedeu o limite de emprestimos!");
            }
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
            if (podeEmprestar()){
                dvdsEmprestados.add(DVD);
                DVD.emprestaItem();
                System.out.println("DVD" + DVD.getTitulo() + " emprestado com sucesso!");
            }
            else{
                System.out.println("Voce ja excedeu o limite de emprestimos!");
            }
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

    public void emprestaOutraMidia(OutrasMidias outraMidia){
        if (outraMidia.getDisponibilidade() == true){
            if (podeEmprestar()){
                outrasMidiasEmprestadas.add(outraMidia);
                outraMidia.emprestaItem();
                System.out.println("Midia" + outraMidia.getTitulo() + " emprestada com sucesso!");   
            }
            else{
                System.out.println("Voce ja excedeu o limite de emprestimos!");
            }
        }
        else{
            System.out.println("A midia nao esta disponivel!");
        }
    }

    public void devolveOutraMidia(OutrasMidias outraMidia){
        if (outrasMidiasEmprestadas.contains(outraMidia)){
            outrasMidiasEmprestadas.remove(outraMidia);
            outraMidia.devolveItem();
            System.out.println("Midia " + outraMidia.getTitulo() + " devolvida com sucesso!");
        }
        else{
            System.out.println("Voce nao emprestou esta midia.");
        }
    }

}
