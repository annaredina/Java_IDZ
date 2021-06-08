package com.company;

/**
 * КруглоеОтверстие совместимо с КруглымиКолышками.
 */
public class CofeeJar {
    private double fats;

    public CofeeJar(double fats) {
        this.fats = fats;
    }

    public double getFats() {
        return fats;
    }

    public boolean fits(Coffee peg) {
        boolean result;
        result = (this.getFats() >= peg.getFats());
        return result;
    }
}