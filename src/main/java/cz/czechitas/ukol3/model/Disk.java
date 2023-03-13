package cz.czechitas.ukol3.model;

public class Disk {
    public long kapacita;
    public long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
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

