package pl.sdacademy.rationalnumber;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }


}
