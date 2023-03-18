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
        lencinProcesor.setRychlost(3_000_000L);
        lencinProcesor.setVyrobce("Intel");

        Pamet lencinaPamet = new Pamet();
        lencinaPamet.setKapacita(80_000_000L);

        Disk lencinDisk = new Disk();
        lencinDisk.setKapacita(477_000_000L);
        lencinDisk.setVyuziteMisto(125_000_000L);

        lencinPocitac.setCpu(lencinProcesor);
        lencinPocitac.setRam(lencinaPamet);
        lencinPocitac.setPevnyDisk(lencinDisk);

        System.out.println(lencinPocitac.toString());

        lencinPocitac.zapniSe();
        System.out.println(lencinPocitac.toString());

        lencinPocitac.vypniSe();
        lencinPocitac.vypniSe();

        lencinPocitac.vytvorSouborOVelikosti(2000L);
        System.out.println(lencinPocitac.toString());

        lencinPocitac.vymazSouboryOVelikosti(4000L);
        System.out.println(lencinPocitac.toString());

        lencinPocitac.zapniSe();
        lencinPocitac.vytvorSouborOVelikosti(2000L);
        System.out.println(lencinPocitac.toString());

        lencinPocitac.vymazSouboryOVelikosti(4000L);
        System.out.println(lencinPocitac.toString());

        lencinPocitac.vymazSouboryOVelikosti(135002000L);
        System.out.println(lencinPocitac.toString());

        lencinPocitac.vytvorSouborOVelikosti(2000000000000L);
        System.out.println(lencinPocitac.toString());


    }

}
