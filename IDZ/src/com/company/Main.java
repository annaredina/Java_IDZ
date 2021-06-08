package com.company;
/**Процент жирности напитка для взбития**/
public class Main {

    public static void main(String[] args) {
        // Кофе в кофемашину — всё работает.
        CofeeJar jar = new CofeeJar(5);
        Coffee cupOfCoffee = new Coffee(5);
        if (jar.fits(cupOfCoffee)) {
            System.out.println("Coffee with 5% fats fits CoffeeJar");
        }

        Borsh smallCup = new Borsh(2);
        Borsh largeCup = new Borsh(20);
        // jar.fits(smallCup); // Не скомпилируется.

        // Адаптер решит проблему.
        Adapter smallAdapter = new Adapter(smallCup);
        Adapter largeAdapter = new Adapter(largeCup);
        if (jar.fits(smallAdapter)) {
            System.out.println("Borsh with sourCream 2% fits Coffee 5%");
        }
        if (!jar.fits(largeAdapter)) {
            System.out.println("Borsh with sourCream 20% doesnt fit Coffee 5%");
        }
    }
}

