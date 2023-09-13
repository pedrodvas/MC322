package multimidia;

public class DVD extends ItemBiblioteca{
/*Essa classe ira representar um DVD de video presente na biblioteca */
    private String diretor;
    public String registro; //Aqui temos um registro para diferenciar dois DVDs iguais
    private int duracao; //Aqui guardamos o tempo de duracao do DVD em minutos
    private boolean disponibilidade = true;

    public DVD(String titulo, String diretor, String registro, int duracao){
        super(titulo);
        this.diretor = diretor;
        this.registro = registro;
        this.duracao = duracao;
    }

    public String getDiretor(){
        return diretor;
    }

    public String getRegistro(){
        return registro;
    }

    public int getDuracao(){
        return duracao;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
}
