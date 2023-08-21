import java.time.LocalDate;
import biblioteca.Livro;
import biblioteca.Biblioteca;
import biblioteca.Membro;
import biblioteca.Emprestimo;
class SistemaDeBiblioteca {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Livro OnePiece = new Livro("One Piece", "Eiichiro Oda", "Panini", "1234-5678");
        Membro PedroMembro = new Membro("Pedro Damasceno", "62388429382");
        Emprestimo novoEmprestimo = new Emprestimo(OnePiece, PedroMembro, LocalDate.of(2023, 8, 13), LocalDate.of(2023, 8, 20));
    }
}
