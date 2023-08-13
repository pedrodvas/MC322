import java.util.List;
import java.util.ArrayList;

class Biblioteca {
    /*Esta classe é responsável por representar toda a biblioteca. Nela, teremos listas para indicar os livros existentes, os membros, os funcionários e
     * os empréstimos que foram realizados. */
        private List<Livro> livros;
        private List<Membro> membros;
        private List<Funcionario> funcionarios;
        private List<Emprestimo> emprestimos;
    
        public Biblioteca(){
            this.livros = new ArrayList<>();
            this.membros = new ArrayList<>();
            this.funcionarios = new ArrayList<>();
            this.emprestimos = new ArrayList<>();
        }
    
        public List<Livro> getLivros(){
            return livros;
        }
    
        public List<Membro> getMembros(){
            return membros;
        }
    
        public List<Funcionario> getFuncionarios(){
            return funcionarios;
        }
    
        public List<Emprestimo> getEmprestimos(){
            return emprestimos;
        }
    }