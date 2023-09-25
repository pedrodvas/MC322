package multimidia;

public class OutrasMidias extends ItemBiblioteca {
    private String tipoMidia;
    private String formato;
    private int numeroCopias;
    private int copiasDisponiveis;
    private String localização;
    private String estadoConservação;

    public OutrasMidias(String titulo, String tipoMidia, String formato, int numeroCopias, String localização, String estadoConservação) {
        super(titulo);
        this.tipoMidia = tipoMidia;
        this.formato = formato;
        this.numeroCopias = numeroCopias;
        this.copiasDisponiveis = numeroCopias;
        this.localização = localização;
        this.estadoConservação = estadoConservação;
    }

    public String getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public String getEstadoConservação() {
        return estadoConservação;
    }

    public void setEstadoConservação(String estadoConservação) {
        this.estadoConservação = estadoConservação;
    }
}
