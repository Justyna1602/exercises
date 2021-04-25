package pl.sdacademy.warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Janusz", 80, 32);
        System.out.println(warrior1);
        Warrior warrior2 = new Warrior("Maksiumus");
        System.out.println(warrior2);
        System.out.println("Janusz uderza Maksiumusa ");
        warrior1.hit(warrior2);
        System.out.println(warrior2);


    }
}
