package com.company;

/**
 * кофе совместимо с кофейным аппаратом.
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