package pl.camp.it.abstrakcja.example;

import pl.camp.it.abstrakcja.InterfejsDziecko;
import pl.camp.it.abstrakcja.InterfejsRodzic;
import pl.camp.it.abstrakcja.KlasaImplementujacaDziecko;

public class App {
    public static void main(String[] args) {
        AlgorytmDoLiczenia a = new DBAlgorytm();
        a.calculate();

        AlgorytmDoLiczenia a2 = new InternetAlgorytm();
        a2.calculate();

        //Object k = new KlasaImplementujacaDziecko();
    }
}
