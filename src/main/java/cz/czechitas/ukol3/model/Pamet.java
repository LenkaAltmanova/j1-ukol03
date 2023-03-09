package cz.czechitas.ukol3.model;

public class Pamet {

    private Long kapacita;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacita=" + kapacita +
                '}';
    }
}
