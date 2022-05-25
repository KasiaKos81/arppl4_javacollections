package javacollections.zadanieZKoszykiem;

public class Produkt {

private String nazwaProduktu;
private double cenaProduktu;
private PodatekProduktu iloscPodatku;


    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu iloscPodatku) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.iloscPodatku = iloscPodatku;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public double cenaBrutto(){
        return cenaProduktu + (cenaProduktu * iloscPodatku.getWartoscPodatku());
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public PodatekProduktu getIloscPodatku() {
        return iloscPodatku;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", iloscPodatku=" + iloscPodatku +
                '}';
    }


}
