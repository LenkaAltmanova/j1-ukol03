package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac lencinPocitac;
        lencinPocitac = new Pocitac();
        System.out.println(lencinPocitac.toString());
        lencinPocitac.zapniSe();

        Procesor lencinProcesor = new Procesor();
        lencinProcesor.setRychlost(3000000L);
        lencinProcesor.setVyrobce("Intel");

        Pamet lencinaPamet = new Pamet();
        lencinaPamet.setKapacita(80000000L);

        Disk lencinDisk = new Disk();
        lencinDisk.setKapacita(477000000L);
        lencinDisk.setVyuziteMisto(125000000L);

        lencinPocitac.setCpu(lencinProcesor);
        lencinPocitac.setRam(lencinaPamet);
        lencinPocitac.setPevnyDisk(lencinDisk);

        System.out.println(lencinPocitac.toString());

        lencinPocitac.zapniSe();

        System.out.println(lencinPocitac.toString());
        lencinPocitac.vypniSe();


        System.out.println("Program spuštěn.");
    }

}
