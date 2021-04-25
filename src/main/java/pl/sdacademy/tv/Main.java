package pl.sdacademy.tv;

public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television(12, 52, 5, true);
        Television tv2 = new Television(4);
        System.out.println("zadanie 2: ");
        System.out.println("tv1: " + tv1);
        System.out.println("tv2 " + tv2);
        System.out.println("zadanie 3 włączenie: ");
        tv2.turnOn();
        System.out.println(tv2);
        System.out.println("zadanie 3 wyłączenie: ");
        tv1.turnOff();
        System.out.println(tv1);

    }
}
