package pl.sdacademy.drink;

public class Main {
    public static void main(String[] args) {
        Drink water = new Drink("Cisowianka", 1500, true);
        System.out.println(water);
        System.out.println("zadanie 2");
        System.out.println(water.exercise2(500));
        System.out.println("zadanie 3");

    }


}
