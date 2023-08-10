import java.util.List;
import java.util.ArrayList;

public class Membro {
    private String nome;
    private String cpf;
    private String senha;
    private String email;
    private int celular;
    private List<String> livros_alugados;
    private List<Int> datas_devolução;


    public Membro(String nome, String cpf, int senha, String email, int celular){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
    }

    public String get_nome(){
        return nome;
    }
    public String get_cpf(){
        return cpf;
    }
    public String get_senha(){
        return senha;
    }
    public String get_email()
    {
        return email;
    }
    public String get_celular()
    {
        return celular;
    }
    public String get_livros(){
        return livros_alugados;
    }
    public Int get_datas_devolução(){
        return datas_devolução;
    }

    public Boolean devolução_atrasada(int data_atual){
        int n_livros = livros_alugados.size();
        for (int i=0; i<n_livros; i++){
            if (data_atual > datas_devolução[i]){
                return true;
            }
        }
        return false;
    }
    
}
