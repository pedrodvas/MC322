class Livro {
    /*Iremos representar um livro da biblioteca, que será identificado pelo seu título, autor, editora e um código de registro (que irá diferenciar para
    * o sistema dois livros que contém os dados anteriores iguais), além de uma variável booleana que irá indicar se ele está disponível para ser emprestado
    * ou não.*/    
        private String titulo;
        private String autor;
        private String editora;
        private String registro;
        protected boolean disponibilidade = true;
    
        public Livro(String titulo, String autor, String editora, String registro){
            this.titulo = titulo;
            this.autor = autor;
            this.editora = editora;
            this.registro = registro;
        }
    
        public String getTitulo(){
            return titulo;
        }
    
        public String getAutor(){
            return autor;
        }
    
        public String getEditora(){
            return editora;
        }
    
        public String getRegistro(){
            return registro;
        }

        public void emprestaLivro(){
            disponibilidade = false;
        }

        public void devolveLivro(){
            disponibilidade = true;
        }
    }