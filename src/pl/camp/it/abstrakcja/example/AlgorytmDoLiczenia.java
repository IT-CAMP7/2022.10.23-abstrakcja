package pl.camp.it.abstrakcja.example;

public abstract class AlgorytmDoLiczenia {
    public void calculate() {
        loadData();
        stepOne();
        stepTwo();
        stepThree();
        saveResult();
    }

    public abstract void loadData();

    public void stepOne() {
        System.out.println("pierwszy krok liczenia");
    }

    private void stepTwo() {
        System.out.println("drugi krok liczenia");
    }

    private void stepThree() {
        System.out.println("trzeci krok liczenia");
    }

    public abstract void saveResult();
}
