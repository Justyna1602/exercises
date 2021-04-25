package pl.sdacademy.drink;

public class Drink {
    private String name;
    private int volume;
    private boolean fizzy;

    public Drink(String name, int volume, boolean fizzy) {
        this.name = name;
        this.volume = volume;
        this.fizzy = fizzy;
    }

    public String toString() {
        return "Napój " + name + ", objętość " + volume + ", czy gazowany: " + fizzy;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isFizzy() {
        return fizzy;
    }


    //N.2 Napoju można się napić (dodaj metodę to reprezentującą).
    // Jako argument zadawana jest pita objętość.
    // Objętość napoju ulega pomniejszeniu o upitą wartość.
    public int exercise2(int drinkVolume) {
        return volume - drinkVolume;

    }

    //N.3 W przypadku, gdy następuje próba wypicia większej ilości,
    // niż objętość napoju, objętość napoju zostaje wyzerowana.


}
