package pl.camp.it.abstrakcja.example;

public class InternetAlgorytm extends AlgorytmDoLiczenia {
    @Override
    public void loadData() {
        System.out.println("Sciagam dane z internetu");
    }

    @Override
    public void saveResult() {
        System.out.println("wysylanie wyniku mailem");
    }
}
