package pl.sdacademy.drink;

public class Main {
    public static void main(String[] args) {
        Drink water = new Drink("Cisowianka", 1500, true);
        System.out.println(water);
        System.out.println("zadanie 2/3");
        water.drink(350);
        System.out.println(water);


    }


}
