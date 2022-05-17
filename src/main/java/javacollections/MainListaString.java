package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainListaString {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String element;
        do {
            System.out.println("Wpisz kolejny element, lub wpisz 'quit' aby zakończyć");
            element = scanner.next();
            if(!element.equals("quit")) {
                lista.add(element);
            }

        } while (!element.equals("quit"));
        // lista.remove("quit");

        System.out.println("wpisane elementy");
        System.out.println(lista);

        System.out.println("Wpisz element do znalezienia");
        String szukanyElement = scanner.next();

        int indeksSzukanegoElementu = lista.indexOf(szukanyElement);
        System.out.println("Znaleziono na indeksie " + indeksSzukanegoElementu);

        boolean czyZnaleziono = lista.contains(szukanyElement);
        System.out.println("Czy lista contains szukany element " + czyZnaleziono);

        // sprawdzenie czy lista jest pusta
        System.out.println("czy lista jest pusta: " + lista.isEmpty());

        System.out.println("rozmiar listy wynosi: " + lista.size());

        // czyszczenie listy
        // lista.clear();

        // sortowanie listy
        Collections.sort(lista);

        // skopiowanie  listy
        List<String> kopia = new ArrayList<>(lista);


    }}
