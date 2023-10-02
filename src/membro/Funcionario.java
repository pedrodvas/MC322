package membro;
import java.util.ArrayList;
import java.util.List;

public class Funcionario{
    private String nome;
    private String cpf;
    private String nivelAcesso; //Para sabermos se eh um gerente, atendente, etc
    private float salario;
    private List<String> funcoes_permitidas;

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

    }
}