package com.company;
/**Процент жирности напитка для взбития**/
public class Main {

    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        CofeeJar hole = new CofeeJar(5);
        Coffee rpeg = new Coffee(5);
        if (hole.fits(rpeg)) {
            System.out.println("Coffee with 5% fats fits CoffeeJar");
        }

        Borsh smallSqPeg = new Borsh(2);
        Borsh largeSqPeg = new Borsh(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        Adapter smallSqPegAdapter = new Adapter(smallSqPeg);
        Adapter largeSqPegAdapter = new Adapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Borsh with sourCream 2% fits Coffee 5%");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Borsh with sourCream 20% doesnt fit Coffee 5%");
        }
    }
}

