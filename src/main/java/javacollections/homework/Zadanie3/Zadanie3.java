package javacollections.homework.Zadanie3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie3 {

    public static void main(String[] args) {

        List<String> doSkopiowania = Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912");
        List<String> lista = new ArrayList<>(doSkopiowania);

        // określ indeks elementu 138751 posługując sie metodą indexOf

        System.out.println("Indeks elementu: " + lista.indexOf("138751"));

        // sprawdź czy istnieje na liście obiekt "67888" metodą contains

        boolean czyJestNaLiscie = lista.contains("67888");
        if (czyJestNaLiscie) {
            System.out.println("jest na liście");
        } else {
            System.out.println("nie ma go na liście");
        }

        // opcka 2
        System.out.println("czy jest na liście: " + czyJestNaLiscie);

        // opcja 3
        System.out.println("czy jest na liście: " + lista.contains("67888"));

        System.out.println("czy jest na liście: " + lista.contains("67889"));

        // usunięcie elementu
        lista.remove("67888");

        // w tym przypadku sprawdzamy czy element 67889 został usunięty (czy był na liście)
        boolean czyZostalUsuniety = lista.remove("67889");
        System.out.println("czy został usuniety");

        // wykonaj ponownie powyższe sprawdzenie
        System.out.println("czy jest na liście: " + lista.contains("67888"));
        System.out.println("czy jest na liście: " + lista.contains("67889"));

        for (int i = 0; i < lista.size(); i++) {
            String elementLista = lista.get(i);
            System.out.println(elementLista + " ");

        }
        // ten sout niżej oddziela listy w sensie wydruk
        System.out.println();
        for (String elementListy : lista) {
            System.out.println(elementListy + " ");

        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i+1) + " " + lista.get(i));
        }

    }
}
