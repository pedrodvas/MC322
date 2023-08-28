package membro;

public class Professor extends Membro {
    public String departamento; //Departamento do qual o professor faz parte
    public String instituto; //Instituto da faculdade ao qual ele pertence

    public Professor(String nome, String cpf, String departamento, String instituto){
        super(nome, cpf);
        this.departamento = departamento;
        this.instituto = instituto;
    }

    public String getDepartamento(){
        return departamento;
    }

    public String instituto(){
        return instituto;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public boolean ehProfessor(){
        return true;
    }
}