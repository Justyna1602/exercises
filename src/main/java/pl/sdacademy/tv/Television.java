package pl.sdacademy.tv;

public class Television {
    //T.1 Stwórz klasę reprezentującą Telewizor o polach:
    //- głośność
    //- liczba programów
    //- aktualny program
    //- czy włączony
    private int volume;
    private int numberOfPrograms;
    private int currentProgram;
    private boolean turnOn;
    //T.2 W klasie mamy konstruktor ustalający wartości wszystkich pól zgodnie z wartościami parametrów.
    //W klasie mamy r również konstruktor ustalający jedynie wartość liczby programów zgodnie z wartością parametru -
    // w takim wypadku tworzony telewizor będzie wyłączony, aktualny program ma wartość 1, a głośność 0.


    public Television(int volume, int numberOfPrograms, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.numberOfPrograms = numberOfPrograms;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }

    public Television(int numberOfPrograms) {
        this.numberOfPrograms = numberOfPrograms;
    }

    //T.3 Mamy również metodę o sygnaturze public String toString,
    // zwracającą opis telewizora. Jeśli telewizor jest wyłączony,
    // to zwrócony opis ma jedynie zawierać informację "Wyłączony telewizor". Gdy telewizor jest włączony,
    // opis ma wyglądać podobnie do:
    //"Włączony telewizor. Aktualny program X (z Y dostępnych). Ustawiona głośność to Z."
    public String toString() {
        if (turnOn) {
            return "Włączony televizor. Aktualny Program " + currentProgram + " , z " + numberOfPrograms + " dostępnych. Ustawiona głośność to : " + volume;
        } else {
            return "Wyłączony telewizor";
        }
    }
}
