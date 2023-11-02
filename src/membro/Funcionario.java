package membro;
import java.util.List;

public class Funcionario{
    private String nome;
    private String cpf;
    private String nivelAcesso; //Para sabermos se eh um gerente, atendente, etc
    private float salario;
    private List<String> funcoesPermitidas;

    public Funcionario(String nome, String cpf, String nivelAcesso, float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.nivelAcesso = nivelAcesso;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNivelAcesso(){
        return nivelAcesso;
    }

    public float getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void funcionarioComando(String comando){
        try{
            if (this.funcoesPermitidas.contains(comando)){
                System.out.println("O comando " + comando + "foi executado\n");
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException exception){
            System.err.println("O funcionário não tem permissão para executar o comando " + comando + "\n");
        }
    }
}