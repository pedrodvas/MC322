package biblioteca;

public class Funcionario {
    /*Nesta classe, iremos representar um funcionário da biblioteca. Consideramos importante ter os dados referentes ao seu nome, CPF e salário. */
        private String nome;
        private String cpf;
        private float salario;
        
        public Funcionario(String nome, String cpf, float salario){
            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
        }
    
        public String getNome(){
            return nome;
        }
    
        public String getCpf(){
            return cpf;
        }
    
        public float getSalario(){
            return salario;
        }
    }