package pl.sdacademy.warrior;

public class Warrior {
//W.1. Stwórz klasę reprezentującą wojownika. Wojownik powinien mieć pola:

    //- imię
    private String name;
    //- siła ataku
    private int power;
    //- punkty życia
    private int hitPoints;

    //W.2. Wojownik posiada konstruktor tworzący obiekt o zadanym imieniu, sile ataku oraz punktach życia.

    public Warrior(String name, int power, int hitPoints) {
        this.name = name;
        this.power = power;
        this.hitPoints = hitPoints;
    }
// Posiada również konstruktor tworzący wojownika o zadanym imieniu, stu punktach życia o sile ataku równej 1.
    public Warrior (String name){
        this.name = name;
        hitPoints = 100;
        power = 1;

    }
  //W.3. Dodaj metodę public String toString zwracającą opis wojownika
    public String toString(){
        // (zawierającą jego imię, siłę ataku oraz punkty życia).
        return "Tworzymy wojownika o imieniu: " + name + ", sile ataku " + power + " oraz " + hitPoints + " punktach życia.";
    }

    //W.4. Wojownik posiada metodę hit, przyjmującą jako argument wojownika.
    // Wojownik, w kontekście którego metoda została wywołana zada wojownikowi przekazanemu jako argument obrażenia równe jego sile ataku.
    // Obrażenia będą reprezentowane przez utratę punktów życia.
    public void hit(Warrior warrior2){
        warrior2.hitPoints -= power;
    }
    //W.5. Wojownik posiada również metodę fight, która jako argument przyjmie wojownika.
    // Wywołanie metody reprezentuje walkę wojowników, póki nie zginie pierwszy z nich.
    // Na przemian zadają sobie ciosy, póki jednemu z nich zabraknie punktów życia.


}
