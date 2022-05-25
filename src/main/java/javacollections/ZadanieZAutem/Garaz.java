package javacollections.ZadanieZAutem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garaz {

    private List <Car> listaSamochodow = new ArrayList<>();

    public void wjazdSamochodu (Car samochod){
        listaSamochodow.add(samochod);
    }

    public void wyjazdSamochodu(){

    }
    public void wyjadSamochodu(String numerRejestracyjny) {
        for (Car car : listaSamochodow) {
            if(car.getNumerRejestracyjny().equals(numerRejestracyjny)){
                listaSamochodow.remove(car);
                System.out.println("wyjechał");
                return; // break
                // break zamiast return to wypisze nam sie komunikat "wyjechał" i "nie znlaeźliśmy"
            }
        }
        System.out.println("nie znaleźliśmy samochodu: " + numerRejestracyjny);
    }
    public void wypiszSamochody(){
        for (Car car : listaSamochodow) {
            System.out.println(car);
        }
    }
    public void wypiszRejestracjeSamochodow(){
        System.out.println("tablice rejestracyjne aut");
        for (Car car : listaSamochodow) {
            System.out.println(car.getNumerRejestracyjny());

        }
    }
    public void wypiszSamochodyZTablicazaczynajacaSieNa (String poczatekRejestracji){
        System.out.println("samocody gdzie rej zaczyna się od " + poczatekRejestracji + ":");
        for (Car car : listaSamochodow) {
            if(car.getNumerRejestracyjny().startsWith(poczatekRejestracji)){
                System.out.println(car);
            }
        }

    }
    public Optional<Car> wyjazdAuta(String numerRejestracyjny){
        for (Car car : listaSamochodow) {
            if(car.getNumerRejestracyjny().equals(numerRejestracyjny)){
                listaSamochodow.remove(car);
                return Optional.of(car);
            }
        }
        return Optional.empty(); // ukradli auto

    }
}
