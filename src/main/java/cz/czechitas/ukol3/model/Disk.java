package cz.czechitas.ukol3.model;

public class Disk {
    private Long kapacita;
    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return
                "kapacita:" + this.kapacita + " bajtů" + ", využité místo:" + this.vyuziteMisto + " bajtů";
                }
    }

