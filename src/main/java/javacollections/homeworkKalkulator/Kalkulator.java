package javacollections.homeworkKalkulator;

public class Kalkulator {

    private double wynikOstatniegoDzialania;

    public double odejmij(double liczbaA, double liczbaB){
        wynikOstatniegoDzialania = liczbaA-liczbaB;
        return wynikOstatniegoDzialania;
    }

    public double dodaj(double liczbaA, double liczbaB){
        wynikOstatniegoDzialania = liczbaA+liczbaB;
        return wynikOstatniegoDzialania;
    }
    public double pomnoz(double liczbaA, double liczbaB){
        wynikOstatniegoDzialania = liczbaA*liczbaB;
        return wynikOstatniegoDzialania;
    }
    public double podziel(double liczbaA, double liczbaB){
        wynikOstatniegoDzialania = liczbaA/liczbaB;
        return wynikOstatniegoDzialania;
    }
    public double zwrocWynikOstatniegoDzialania (){
        return wynikOstatniegoDzialania;
    }


    public double getWynikOstatniegoDzialania() {
        return wynikOstatniegoDzialania;
    }


}
