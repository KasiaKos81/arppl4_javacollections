package javacollections.zadanieZKoszykiem;

import java.util.ArrayList;
import java.util.List;

// Rachunek
// sumujWartoscNetto() 80 double
// sumujWartoscBrutto() 100 double
// wypisz() - void / bo sout
// wypiszProduktyOpodatkowaneNa(PodatekProduktu podatek) - void

public class Asortyment {

    private List<Produkt> warzywa = new ArrayList<>();
    private List<Produkt> nabial = new ArrayList<>();

    public void dodajWarzywo(Produkt produkt) {
        warzywa.add(produkt);
    }

    public void dodajNabial(Produkt produkt) {
        nabial.add(produkt);

    }
    public void wypisz(){
        System.out.println("warzywa");
        for (Produkt warzywo : warzywa) {
            System.out.println(warzywo);
        }
        System.out.println("nabiały");
        for (Produkt jakisNabial : nabial) {
            System.out.println(jakisNabial);

        }

    }
    public void wypiszTanszeNiz(double cena){
        System.out.println("produkty o cenie nizszej niż " + cena);
        for (Produkt warzywo : warzywa) {
            if(warzywo.cenaBrutto() < cena){
                System.out.println(warzywo);
            }

        }
        for (Produkt jakisNabial : nabial) {
            if(jakisNabial.cenaBrutto() < cena){
                System.out.println(jakisNabial);
            }

        }

    }

    public void szukajProduktu(String nazwa) {
        for (Produkt warzywo : warzywa) {
            if (warzywo.getNazwaProduktu().contains(nazwa)){
                System.out.println(nazwa);
            }
        }
        for (Produkt jakisNabial : nabial) {
            if(jakisNabial.getNazwaProduktu().contains(nazwa)){
                System.out.println(nazwa);
            }
        }

    }

    // wypiszProduktyOpodatkowaneNa(PodatekProduktu podatek) - void
    public void wypiszProduktyOpodatkowaneNa(PodatekProduktu podatek) {
        for (Produkt warzywo : warzywa) {
            if(warzywo.getIloscPodatku() == podatek){
                System.out.println(warzywo);
            }
        }

    }
}
