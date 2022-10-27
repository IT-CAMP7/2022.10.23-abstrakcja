package pl.camp.it.abstrakcja;

public class App {
    public static void main(String[] args) {
        UmowaZKolega car = new Truck();
        car.drive(50);

        System.out.println(car);

        for(int i = 0; i < 10; i++) {
            car.broke();
        }

        car.mrygajKierunkowskazem();

        /*UmowaZKolega u = new UmowaZKolega();
        u.drive(5);*/

        Klasa k = new Klasa();
        k.b();

        System.out.println(Constants.PI);

        KlasaDziedziczacaPoKlasieAbstrakcyjnej kd =
                new KlasaDziedziczacaPoKlasieAbstrakcyjnej();

        kd.metodaAbstrakcyjna();
    }
}
