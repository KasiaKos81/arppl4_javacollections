package javacollections.zadanieZKoszykiem;

public class AsortymentMain {

    public static void main(String[] args) {

        Asortyment asortyment = new Asortyment();

        Produkt marchew = new Produkt("marchew", 1.0, PodatekProduktu.VAT8);
        asortyment.dodajWarzywo(marchew);

        Produkt ser = new Produkt("ser", 3.40, PodatekProduktu.VAT23);
        asortyment.dodajNabial(ser);

        asortyment.wypisz();

        // wywoała metode co wypisuje prod o cenie nizszej niz
        asortyment.wypiszTanszeNiz(5.0);

        // wywołam fukncje ktora wypisuje produkty ktore w nazwie zaieraja ser
        // slowo powinno byc podane w paramatrze

        asortyment.szukajProduktu("ser");
    }
}
