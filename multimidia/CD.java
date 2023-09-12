package multimidia;

public class CD extends ItemBiblioteca{
/*Esta classe ira representar um CD de audio presente na biblioteca */
    private String artista;
    private String registro; //Para diferenciarmos dois CDs iguais
    private int numeroFaixas; //Guarda a quantidade de faixas disponiveis 
    private boolean disponibilidade = true;

    public CD(String titulo, String artista, int numeroFaixas){
        super(titulo);
        this.artista = artista;
        this.numeroFaixas = numeroFaixas;
    }

    public String getArtista(){
        return artista;
    }

    public String getRegistro(){
        return registro;
    }

    public int getNumeroFaixas(){
        return numeroFaixas;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }

    public void setNumeroFaixas(int numeroFaixas){
        this.numeroFaixas = numeroFaixas;
    }

    public boolean ehCD(){
        return true;
    }
}