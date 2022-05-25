package javacollections.ZadanieZAutem;

import javacollections.zadanieZKoszykiem.Asortyment;
import javacollections.zadanieZKoszykiem.PodatekProduktu;
import javacollections.zadanieZKoszykiem.Produkt;

import java.util.Optional;

public class MainGaraz {

    public static void main(String[] args) {

        Garaz garaz = new Garaz();

        Car car1 = new Car("NEL37349");
        Car car2 = new Car("GD624CR");
        Car car3 = new Car("GD1234");

        garaz.wjazdSamochodu(car1);
        garaz.wjazdSamochodu(car2);
        garaz.wjazdSamochodu(car3);

        garaz.wyjadSamochodu("NEL37349");

        garaz.wypiszSamochodyZTablicazaczynajacaSieNa("NEL");

        Optional<Car> carCoWyjechalCanBeHere = garaz.wyjazdAuta("GD1234");
        if (carCoWyjechalCanBeHere.isPresent()){
            Car carCoWyjechal = carCoWyjechalCanBeHere.get();
            System.out.println("wyjechał " + carCoWyjechal.getNumerRejestracyjny());
        } else {
        System.out.println("zajebali");

    }

}}
