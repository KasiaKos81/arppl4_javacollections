package javacollections.zadanieZKoszykiem;

import java.util.ArrayList;
import java.util.List;

public class MainKoszyk {

    // Stworzymy koszyk zakupowy z produktami. Nasz koszyk będzie przechowywał zamówienie które możemy złożyć w pizzerii lub restauracji (lub sklepie).
    //Stwórz enum PodatekProduktu i dodaj wartości:
    //VAT8
    //VAT23
    //VAT5
    //NO_VAT
    //Stwórz klasę Produkt. Dodaj w niej pola:
    // nazwa produktu
    //cena produktu (netto)
    // ilość podatku (PodatekProduktu)
    //Dodaj do klasy Produkt metodę:
    //obliczCeneBrutto():double
    //Stwórz w main Listę Produktów. Dodaj do listy kilka obiektów.
    //wypisz tylko takie, których podatek to VAT8
    //wypisz tylko te których cena netto jest większa niż 100.0
    //wypisz tylko te których cena brutto jest większa niż 110.0

    public static void main(String[] args) {
        List<Produkt> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("masło", 2.30, PodatekProduktu.VAT8));
        listaProduktow.add(new Produkt("telewizor samsung", 100.1, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("komputer samsung", 111.1, PodatekProduktu.VAT5));
        listaProduktow.add(new Produkt("mercedes", 0.50, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("bułka", 5.00, PodatekProduktu.NO_VAT));
        listaProduktow.add(new Produkt("kamera", 110.00, PodatekProduktu.VAT5));

        System.out.println("------------------------");

        System.out.println("tylko VAT8");

        for (Produkt produkt : listaProduktow) {
            if(produkt.getIloscPodatku() == PodatekProduktu.VAT8) {
                System.out.println(produkt);
            }
        }
        System.out.println("-------------------------");

        System.out.println("produkty te z cena powyżej 100");

        for (Produkt produkt : listaProduktow) {
            if (produkt.getCenaProduktu() > 100){
                System.out.println(produkt);
            }
        }
        System.out.println("-----------------------");

        System.out.println("Tylko te których cena brutto jest większa niż 110");

        for (Produkt produkt : listaProduktow) {
            if(produkt.cenaBrutto() > 110.0){
                System.out.println(produkt);
            }
        }
        System.out.println("-----------------------------------");


    }
}
