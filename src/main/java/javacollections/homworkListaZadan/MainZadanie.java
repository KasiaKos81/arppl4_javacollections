package javacollections.homworkListaZadan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainZadanie {

    public static void main(String[] args) {

        ListaZadanDoZrealizowania listaZadan = new ListaZadanDoZrealizowania();

        listaZadan.dodajZadanie(new Zadanie("wlosyFarba", "farbowanieWlosow"));
        listaZadan.dodajZadanie(new Zadanie("hybryda", "malowaniePazurkow"));
        listaZadan.dodajZadanie(new Zadanie("makeup", "rysowanieTwarzy"));
        listaZadan.dodajZadanie(new Zadanie("szpilki", "kupSzpilki"));

        // szukanie zadanie po pełnej nazwie

        listaZadan.wypiszZadanaPoPelnejNazwie("hybryda");
        listaZadan.wypiszZadanaPoPelnejNazwie("makeup");

        System.out.println("-----------------");

        // szukanie po fragmencie nazwy
        listaZadan.szukaniePoFragmencieNazwy("wlosy");


        System.out.println("------------------");
        Optional<Zadanie> wynik = listaZadan.zwrocZadanaPoPelnejNazwie("hybryda");
        if (wynik.isPresent()) {
            System.out.println("udało się znalezc zadanie: " + wynik);
        } else {
            System.out.println("nie udalo sie znalezc zadania");
        }

        // zwracanie zadania po frazie

        System.out.println("-------------------------");
        Optional<Zadanie> toCoWyszlo = listaZadan.zwrocZadaniePoFrazie("wlosy");
        if (toCoWyszlo.isPresent()) {
            System.out.println("wyszło zadanie: " + toCoWyszlo);
        } else {
            System.out.println("gowno znalazl");
        }

        // usuwanie zadania
        listaZadan.usunZadanie("szpilki");

        System.out.println("-----------------------------");
        // oznaczanie jako zrealizowane
        listaZadan.oznaczJakoZrealizowane("makeup");

        listaZadan.wypiszZrealizowane();

        listaZadan.wypiszNiezrealizowane();

        System.out.println("----------------------");
        System.out.println("jak sie uda to zwroci liste :)");
        listaZadan.zwrocListeNiezrealizowanych();
    }


}
