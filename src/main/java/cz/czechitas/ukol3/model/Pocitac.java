package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;


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


    @Override
    public String toString() {
        return "cpu: " + cpu +
                ", ram: " + ram +
                ", pevnyDisk: " + pevnyDisk;
    }


    public boolean jeZapnuty() {
        return jeZapnuty;
    }


    public void zapniSe() {
        if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("Počítač nelze zapnout bez všech komponentů");
            return;
        }

        if (!jeZapnuty) {
            jeZapnuty = true;
            System.out.println("počítač je zapnutý");
        } else {
            System.err.println("počítač nelze zapnout dvakrát");
        }
    }

    public void vypniSe() {
        if (jeZapnuty == true) {
            jeZapnuty = false;
            System.out.println(" počítač se právě vypnul");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty == false) {
            System.err.println("Nelze vytvořit soubor, PC je vypnutý");
            return;
        }


        if (velikost + pevnyDisk.getVyuziteMisto() > pevnyDisk.getKapacita()) {
            System.err.println("Soubor nelze vytvořit");
        } else {
            pevnyDisk.setVyuziteMisto(velikost + pevnyDisk.getVyuziteMisto());
        }

    }

    public void vymazSouboryOVelikosti(long velikost) {

        if (jeZapnuty == false) {
            System.err.println("Nelze smazat soubor, PC je vypnutý");
            return;
        }

        long aktualniKapacita = pevnyDisk.getVyuziteMisto() - velikost;
        if (aktualniKapacita >= 0) {
            pevnyDisk.setVyuziteMisto(aktualniKapacita);
            System.out.println("soubory vymazány");
        }


    }



}
