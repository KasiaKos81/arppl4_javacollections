package javacollections.homework;

import java.util.*;

public class MainHomework2 {

    // Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
    //    - dodaj do listy 10 liczb losowych
    //    - oblicz sumę elementów na liście (wypisz ją)
    //    - oblicz średnią elementów na liście (wypisz ją)
    // podaj mediane elementów na liscie (wypisz ją)

    private static final int ILOSC_LICZB = 10;

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < ILOSC_LICZB; i++) {
            list.add((generator.nextInt()));
        }
        double suma = 0.0;
        for (int i = 0; i < list.size(); i++) {
            suma = suma + list.get(i);
        }
        System.out.println("suma liczb to: " + suma);

        double srednia = suma/ILOSC_LICZB;
        System.out.println("srednia liczb to " + srednia);

        List<Integer> posortowaneLiczby = new ArrayList<>(list);
        Collections.sort(posortowaneLiczby);

        // mediana = środkowy element dla nieparzystych
        // srednia dwóch środkowych dla parzystych

        double mediana;
        if(posortowaneLiczby.size() % 2 == 0){
            // parzyste
            int rozmiarListy = posortowaneLiczby.size();
            int indeksSrodkowegoElementu = rozmiarListy / 2;

            int liczba1 = posortowaneLiczby.get(indeksSrodkowegoElementu);
            int liczba2 = posortowaneLiczby.get(indeksSrodkowegoElementu - 1);
            mediana = (liczba1 + liczba2) / 2.0;

        } else {
            //    nieparzyste
            int rozmiarListy = posortowaneLiczby.size();
            int indeksSrodkowegoElementu = rozmiarListy / 2;

            mediana = posortowaneLiczby.get(indeksSrodkowegoElementu);
        }
        System.out.println("mediana to: " + mediana);


        System.out.println(list);

        int najwieksza = list.get(0);
        int najmniejsza = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > najwieksza){
                najwieksza = list.get(i);
            }
            if(list.get(i) < najmniejsza){
                najmniejsza = list.get(i);
            }
        }
        System.out.println("największy element to " + najwieksza);
        System.out.println("największy element jest na pozycji " + list.indexOf(najwieksza));
        System.out.println("najwmniejszy element to " + najmniejsza);
        System.out.println("najmniejszy element jest na pozycji " + list.indexOf(najmniejsza));
    }
}
