package pl.camp.it.abstrakcja;

import java.util.Random;

public class Car implements UmowaZKolega {
    @Override
    public void drive(int speed) {
        System.out.println("Jade " + speed + " na godzine !!");
    }

    @Override
    public int broke() {
        System.out.println("Psuje sie");
        return new Random().nextInt(9000) + 1000;
    }

    @Override
    public void cos() {
        System.out.println("Auto cos robi !!");
    }

    @Override
    public void mrygajKierunkowskazem() {
        System.out.println("mryg mryg");
    }
}
