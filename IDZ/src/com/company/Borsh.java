package com.company;

public class Borsh {
    private double sourCream;

    public Borsh(double sourCream) {
        this.sourCream = sourCream;
    }

    public double getSourCream() {
        return sourCream;
    }

    public double getFoam() {/**из сметаны в борще делаем сливки менее жирные**/
        double result;
        result = Math.pow(this.sourCream, 1/2);
        return result;
    }
}