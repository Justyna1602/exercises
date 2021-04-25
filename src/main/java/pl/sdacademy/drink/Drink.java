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
    // Objętość napoju ulega pomniejszeniu o upitą wartość. w 3 zmienimy 2!
    //N.3 W przypadku, gdy następuje próba wypicia większej ilości,
    // niż objętość napoju, objętość napoju zostaje wyzerowana.
    public void drink(int volume) {
//        if (volume > this.volume) {
//            this.volume = 0; // referencja do obiektu ktory wywolalismy
//        } else {
//            this.volume -= volume;
//        }
//        this.volume = volume > this.volume ? 0 : this.volume - volume; // do slwka this uzywamy zeby sie do pola odwolac jesli argument mialby inna nazwe nie musimy tego pisac!!!!!


        //N.4 Przy piciu napoju w konsoli zostaje wypisane "gul" dla każdego upitego 100 ml.
        // Jeśli następuje chęć wypicia większej ilości niż tak,
        // która w napoju jest dostępna, dodatkowo wypisane jest w konsoli "wyzerowano!".

        if (volume > this.volume) {
            volume = this.volume;
        }
        this.volume -= volume;
        while (volume > 100){ // dopoki moge wypic 100 ml
            System.out.println("gul");
            volume -= 100;
        }
        if (this.volume == 0) {
            System.out.println("wyzerowano!");
        }

    }


}
