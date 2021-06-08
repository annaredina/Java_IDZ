package com.company;

public class Adapter extends Coffee {
    public Borsh cup;

    public Adapter(Borsh cup) {
        this.cup = cup;
    }

    @Override
    public double getFats() {
        double result;
        // рассчитываем кол-во сметаны из борща для сливок
        result = (Math.sqrt(Math.pow((cup.getFoam() / 2), 2) * 2));
        return result;
    }
}