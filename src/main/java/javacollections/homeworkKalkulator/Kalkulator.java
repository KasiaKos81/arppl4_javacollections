package javacollections.homeworkKalkulator;

public class Kalkulator {

    private double wynikOstatniegoDzialania;

    public double odejmij(double liczbaA, double liczbaB){
        return liczbaA-liczbaB;
    }

    public double dodaj(double liczbaA, double liczbaB){
        return liczbaA+liczbaB;
    }
    public double pomnoz(double liczbaA, double liczbaB){
        return liczbaA*liczbaB;
    }
    public double podziel(double liczbaA, double liczbaB){
        return liczbaA/liczbaB;
    }
    public double zwrocWynikOstatniegoDzialania (){
        return wynikOstatniegoDzialania;
    }

    public Kalkulator(double wynikOstatniegoDzialania) {
        this.wynikOstatniegoDzialania = wynikOstatniegoDzialania;
    }

    public double getWynikOstatniegoDzialania() {
        return wynikOstatniegoDzialania;
    }

    public void setWynikOstatniegoDzialania(double wynikOstatniegoDzialania) {
        this.wynikOstatniegoDzialania = wynikOstatniegoDzialania;
    }
}
