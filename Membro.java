import java.util.ArrayList;
import java.util.List;

class Membro {
    /*Esta classe irá representar um membro da biblioteca por meio do seu nome e do seu CPF. Além disso, também haverá uma lista referente aos livros que
     * foram emprestados para este membro. */
        private String nome;
        private String cpf;
        private List<Livro> livros_emprestados;
    
        public Membro(String nome, String cpf){
            this.nome = nome;
            this.cpf = cpf;
            this.livros_emprestados = new ArrayList<>();
        }
    
        public String getNome(){
            return nome;
        }
    
        public String getCpf(){
            return cpf;
        }
    
        public List<Livro> getLivrosEmprestados(){
            return livros_emprestados;
        }
    }