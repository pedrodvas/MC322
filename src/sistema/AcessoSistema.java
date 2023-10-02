package sistema;

import java.util.List;

import exceptions.LoginException;

public class AcessoSistema {
    private String cpf;
    private String senha;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void login(List<String> cpfs, List<String> senhas) throws LoginException {
        for (int i = 0; i < cpfs.size(); i++) {
            if (this.cpf == cpfs.get(i)){
                if (this.senha == senhas.get(i)){
                    System.out.println("Login efetuado para " + this.cpf + "\n");
                    return;
                }
            }
        }
        throw new LoginException("O login para não foi bem exexcutado");
    }
}