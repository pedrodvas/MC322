package membro;

public class Estudante extends Membro {
    private String tipoVinculo; //Aqui informamos se ele eh da pos ou da graduacao
    private String registroAcademico; //Aqui guardamos o RA do estudante
    private String curso; //Aqui temos o curso do estudante

    public Estudante (String nome, String cpf, String tipoVinculo, String registroAcademico, String curso){
        super(nome, cpf);
        this.tipoVinculo = tipoVinculo;
        this.registroAcademico = registroAcademico;
        this.curso = curso;
    }

    public String getTipoVinculo(){
        return tipoVinculo;
    }

    public String getRegistroAcademico(){
        return registroAcademico;
    }

    public String getCurso(){
        return curso;
    }

    public void setTipoVinculo(String tipoVinculo){
        this.tipoVinculo = tipoVinculo;
    }

    public void setRegistroAcademico(String registroAcademico){
        this.registroAcademico = registroAcademico;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public boolean ehEstudante(){
        return true;
    }

}