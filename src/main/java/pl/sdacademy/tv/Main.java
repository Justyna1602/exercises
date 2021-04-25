package pl.sdacademy.tv;

public class Main {
    public static void main(String[] args) {
        Television television = new Television(12, 52, 5, true);
        System.out.println("zadanie 2: ");
        System.out.println(television);
        System.out.println("zadanie 3: ");
        television.turnOnAndOff();
        System.out.println(television);

    }
}
