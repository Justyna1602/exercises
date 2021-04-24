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
}
