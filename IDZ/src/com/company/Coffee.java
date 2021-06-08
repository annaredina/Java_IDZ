package com.company;

/**
 * кофе совместимо с кофейным аппаратом.
 */
public class Coffee {
    private double fats;

    public Coffee() {}

    public Coffee(double fats) {
        this.fats = fats;
    }

    public double getFats() {
        return fats;
    }
}