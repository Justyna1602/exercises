package pl.sdacademy.rationalnumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber threeQuarters = new RationalNumber(3, 4);
        System.out.println(threeQuarters);
        System.out.println("LIczba przeciwna do " + threeQuarters + " to : " + threeQuarters.getOpposite());
        System.out.println("LIczba odwrotna do " + threeQuarters + " to : " + threeQuarters.getInverse());
        System.out.println("zadanie 3");
        System.out.println(threeQuarters.multiply(new RationalNumber(2,4)));
        System.out.println("zadanie 4");
        System.out.println(threeQuarters.divide(new RationalNumber(2,3)));
    }
}
