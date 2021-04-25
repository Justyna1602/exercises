package pl.sdacademy.tv;

public class Television {
    //T.1 Stwórz klasę reprezentującą Telewizor o polach:
    //- głośność
    //- liczba programów
    //- aktualny program
    //- czy włączony
    private int volume;
    private final int channelCount;
    private int currentChannel;
    private boolean on;
    //T.2 W klasie mamy konstruktor ustalający wartości wszystkich pól zgodnie z wartościami parametrów.
    //W klasie mamy również konstruktor ustalający jedynie wartość liczby programów zgodnie z wartością parametru
    // - w takim wypadku tworzony telewizor będzie wyłączony, aktualny program ma wartość 1, a głośność 0.


    public Television(int volume, int channelCount, int currentChannel, boolean turnOn) {
        this.volume = volume;
        this.channelCount = channelCount;
        this.currentChannel = currentChannel;
        this.on = turnOn;
    }

    public Television(int channelCount) {
        this.channelCount = channelCount;
        on = false;
        currentChannel = 1;
        volume = 0;
    }

    //T.3 Mamy również metodę o sygnaturze public String toString,
    // zwracającą opis telewizora. Jeśli telewizor jest wyłączony,
    // to zwrócony opis ma jedynie zawierać informację "Wyłączony telewizor". Gdy telewizor jest włączony,
    // opis ma wyglądać podobnie do:
    //"Włączony telewizor. Aktualny program X (z Y dostępnych). Ustawiona głośność to Z."
    public String toString() {
        if (on) {
            return "Włączony televizor. Aktualny Program to: " + currentChannel + " , z " + channelCount + " dostępnych. Ustawiona głośność to : " + volume;
        } else {
            return "Wyłączony telewizor";
        }
    }

    //T.4 Do klasy dodaj metody włączajacą oraz wyłączającą telewizor (turnOn i turnOff)
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
    //T.5 Dodaj do klasy metody pogłaśniające oraz sciszające telewizor. Głośność może znajdować się w przedziale 0-10
    // (dalsze sciszanie/pogłaśnianie nie będzie niczym skutkowało).
    // Głośność można zmienić jedynie, gdy telewizor jest włączony. (volumeUp i volumeDown)



}
