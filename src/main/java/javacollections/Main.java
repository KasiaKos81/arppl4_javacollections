package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // lista immutable - niezmenna co do rozmiaru
        List<Integer> listaDoSkopiowaniaAleNieUzywania = Arrays.asList(1, 2, 3, 4, 5);
       //  listaDoSkopiowaniaAleNieUzywania.remove(1); nie działa
       // listaDoSkopiowaniaAleNieUzywania.add(110); nie działa


        List<Integer> lista = new ArrayList<>(listaDoSkopiowaniaAleNieUzywania);
        System.out.println(lista);

        // dodanie na koniec
        lista.add(6);
        System.out.println(lista);

// dodanie większej ilości elementów
        lista.addAll(Arrays.asList(100, 200, 300));

        lista.remove(1);
        System.out.println(lista);

        // przeiterować
        // znaleźć
        int indeksPiatki = lista.indexOf(5);

        // jesli znaleźliśmy to usuń ten index
        lista.remove(indeksPiatki);

        // zamaist dwóch instrukcji u góry można zrobić:
        Integer obiektDoUsuniecia = 5;
        lista.remove(obiektDoUsuniecia);

        // lub
        lista.remove(Integer.valueOf(5));









    }

}
