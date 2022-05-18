package javacollections.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> listaOcen = new ArrayList<>();
    private String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(String numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.listaOcen = new ArrayList<>();
    }

    public double obliczSrednia(){
        if (listaOcen.isEmpty()){
            throw new BrakOcenException();
        }
        double suma = 0.0;
        for (int i = 0; i < listaOcen.size(); i++) {
            suma += listaOcen.get(i);
        }
        return (suma / listaOcen.size());
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
