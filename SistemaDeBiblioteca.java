import java.time.LocalDate;

public class SistemaDeBiblioteca {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Livro OnePiece = new Livro("One Piece", "Eiichiro Oda", "Panini", "1234-5678");
        Membro PedroMembro = new Membro("Pedro Damasceno", "62388429382");
        Funcionario CarolFuncionario = new Funcionario("Carol Kekas", "62388429382", 2500);
        Emprestimo novoEmprestimo = new Emprestimo(OnePiece, PedroMembro, LocalDate.of(2023, 8, 13), LocalDate.of(2023, 8, 20));
    }
}
