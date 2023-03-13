package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;

    private long velikost;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public long getVelikost() {
        return velikost;
    }

    public void setVelikost(long velikost) {
        this.velikost = velikost;
    }

    @Override
    public String toString() {
        return "cpu: " + cpu +
                ", ram: " + ram +
                ", pevnyDisk: " + pevnyDisk ;
    }


    public boolean jeZapnuty() {
        return false;
    }


    public void zapniSe() {
        if (ram == null || cpu == null || pevnyDisk == null ) {
            System.err.println("Počítač nelze zapnout bez všech komponentů");
        }

        if (!jeZapnuty) {
            jeZapnuty = true;
            System.out.println("počítač je zapnutý");
        }else {
            System.err.println("počítač nelze zapnout dvakrát");
        }
    }

    public void vypniSe() {
        if (jeZapnuty == false) {
            System.out.println(" počítač je vypnutý");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (velikost + pevnyDisk.vyuziteMisto > pevnyDisk.kapacita)  {
            System.err.println("Soubor nelze vytvořit");
        } else {long soubor = velikost + pevnyDisk.vyuziteMisto;
        }
        // metoda vytvorSouborOVelikosti zvýší proměnnou vyuziteMisto o velikost
        //pokud by se soubor na disk nevešel (vyuziteMisto > kapacita), metoda vypíše chybu
    }

    public void vymazSouboryOVelikosti(long velikost) {
        long vymazanySoubor = pevnyDisk.vyuziteMisto - velikost;
        if (vymazanySoubor <= 0) {
            System.out.println("soubory vymazány");
        }

        // metoda vymazSouboryOVelikosti sníží proměnnou vyuziteMisto o velikost, nesmí být menší než nula

    }


    /*
    První metoda bude vracet stav, zda je počítač zapnutý (hodnotu fieldu jeZapnuty).
    Další dvě metody budou počítač zapínat resp. vypínat, tj. budou nastavovat proměnnou (field)
    jeZapnuty a do konzole vypíšou odpovídající informaci.
    Počítač není možno zapnout dvakrát. Při takovém pokusu vypište chybovou hlášku.
    Počítač je možno vypnout vícekrát, ale opakované volání metody vypniSe() se ignoruje.

     */

}
