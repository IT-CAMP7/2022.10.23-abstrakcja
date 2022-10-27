package pl.camp.it.abstrakcja.example;

public class DBAlgorytm extends AlgorytmDoLiczenia {
    @Override
    public void loadData() {
        System.out.println("Wczytywanie danych z bazy");
    }

    @Override
    public void saveResult() {
        System.out.println("zapisywanie danych do bazy");
    }
}
