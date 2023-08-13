import java.time.LocalDate;

class Emprestimo {
    /*Esta classe irá representar um empréstimo realizado na biblioteca. Nela, consideramos importante ter o livro que foi emprestado, o membro que o emprestou,
    * a data em que o empréstimo foi realizado e a data prevista de devolução. */
        private Livro livro;
        private Membro membro;
        private LocalDate dataEmprestimo;
        private LocalDate dataDevolucao;
    
        public Emprestimo(Livro livro, Membro membro, LocalDate dataEmprestimo, LocalDate dataDevolucao){
            this.livro = livro;
            this.membro = membro;
            this.dataEmprestimo = dataEmprestimo;
            this.dataDevolucao = dataDevolucao;
        }
    
        public Livro getLivro(){
            return livro;
        }
    
        public Membro getMembro(){
            return membro;
        }
    
        public LocalDate getDataEmprestimo(){
            return dataEmprestimo;
        }
    
        public LocalDate getDataDevolucao(){
            return dataDevolucao;
        }
    }