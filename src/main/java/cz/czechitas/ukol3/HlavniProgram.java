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
        lencinProcesor.setRychlost(400000L);
        lencinProcesor.setVyrobce("Intel");

        Pamet lencinaPamet = new Pamet();
        lencinaPamet.setKapacita(6666666666666666L);

        Disk lencinDisk = new Disk();
        lencinDisk.setKapacita(2555554445454555L);

        lencinPocitac.setCpu(lencinProcesor);
        lencinPocitac.setRam(lencinaPamet);
        lencinPocitac.setPevnyDisk(lencinDisk);

        System.out.println(lencinPocitac.toString());

        lencinPocitac.zapniSe();

        System.out.println(lencinPocitac.toString());
        lencinPocitac.vypniSe();








        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
    }

}
