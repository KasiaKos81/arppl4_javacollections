package javacollections.zadanieZKoszykiem;

public enum PodatekProduktu {

    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0.0);

    private final double wartoscPodatku; // zamiast 8 które trzeba dzielic na 100 przechodujemy wartośc 0.08

    PodatekProduktu(double wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }

    public double getWartoscPodatku() {
        return wartoscPodatku;
    }

}
