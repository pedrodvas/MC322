package membro;
import java.util.ArrayList;

public class EstudantePosGrad extends Estudante {
    private String programaPosGraduação; // Additional field for the specific subclass
    private String cursoGraduação;

    public EstudantePosGrad(String nome, String cpf, String tipoVinculo, String registroAcademico, String curso, String programaPosGraduacao, String cursoGraduação) {
        super(nome, cpf, tipoVinculo, registroAcademico, curso);
        this.programaPosGraduação = programaPosGraduacao;
        this.cursoGraduação = cursoGraduação;
    }

    public String getProgramaPosGraduação() {
        return programaPosGraduação;
    }

    public String getCursoGraduacao() {
        return cursoGraduação;
    }

    public void setProgramaPosGraduação(String programaPosGraduacao) {
        this.programaPosGraduação = programaPosGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduação = cursoGraduacao;
    }

    public Membro tornaMembro() {
        Membro novoMembro = new Membro(this.getNome(), this.getCpf());
        novoMembro.setEmprestimosAtuais(this.getEmprestimosAtuais());
        novoMembro.setLivrosFisicosEmprestados(new ArrayList<>(this.getLivrosFisicosEmprestados()));
        novoMembro.setLivrosDigitaisEmprestados(new ArrayList<>(this.getLivrosDigitaisEmprestados()));
        novoMembro.setCdsEmprestados(new ArrayList<>(this.getCdsEmprestados()));
        novoMembro.setDvdsEmprestados(new ArrayList<>(this.getDvdsEmprestados()));
        novoMembro.setOutrasMidiasEmprestadas(new ArrayList<>(this.getOutrasMidiasEmprestadas()));
    
        return novoMembro;
    }

}