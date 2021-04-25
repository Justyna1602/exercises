package pl.sdacademy.rationalnumber;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //5. Napisz konstruktor, który przyjmie jeden parametr - liczbę całkowitą.
// Metoda zwróci liczbę wymierną równą zadanej liczbie całkowitej.
    public RationalNumber(int x) {
        this.numerator = x;
        this.denominator = 1;
    }

    public String toString() {

        return numerator + " / " + denominator;
    }

    public RationalNumber getOpposite() {
        return new RationalNumber(-numerator, denominator);
    }

    //Napisz metode getInverse, która zwróci liczbę odwrotną (typu RationalNumber).
    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

    //3. Napisz metodę multiply, która przyjmie za parametr obiekt będący liczbą wymierną,
    // a która zwróci wynik mnożenia obiektu, dla którego wywołano metodę przez parametr.
    //Dzięki metodzie multiply możemy pomnożyć dwie liczby wymierne - pierwszą będzie ta,
    // której metodę wywołamy, drugą będzie liczba przekazana przy użyciu parametru.
    // Metoda zwróci iloczyn tych dwóch liczb (wynikiem będzie oczywiście również liczba wymierna)
    public RationalNumber multiply(RationalNumber number) {
        return new RationalNumber(this.numerator * number.numerator, this.denominator * number.denominator);

    }

    // 4. Napisz metodę divide, która zadziała analogicznie do metody multiply.
    public RationalNumber divide(RationalNumber divider) {
//        return multiply(divider.getInverse()); dodatkowe rozwiązanie. getInvers odwrotnosc argumentu
        return new RationalNumber(this.numerator * divider.denominator, this.denominator * divider.numerator);
    }

    //6. Napisz w klasie RationalNumber metodę add,
    // która za parametr przyjmie liczbę całkowitą.
    // Metoda zwróci wartość liczby, dla której
    // wywołano metodę powiększoną o wartość parametru
    public RationalNumber add(int i) {
        int resultNumerator = numerator + i * denominator;
        return new RationalNumber(resultNumerator,denominator);
    }


}
