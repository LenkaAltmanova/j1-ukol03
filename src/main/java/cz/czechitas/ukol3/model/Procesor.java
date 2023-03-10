package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Procesor {

    private String vyrobce;

    private Long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public Long getRychlost() {
        return rychlost;
    }

    public void setRychlost(Long rychlost) {
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return  vyrobce + ", " + rychlost
                ;
    }

    public void setRychlost() {
        this.rychlost = rychlost;
    }
}
