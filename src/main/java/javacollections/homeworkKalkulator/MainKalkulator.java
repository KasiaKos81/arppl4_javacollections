package javacollections.homeworkKalkulator;

import java.util.Scanner;

public class MainKalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        Double wynik = null;

        do {
            System.out.println("podaj działanie: dodaj, odejmij, pomnoz, podziel, zwrocWynik");
            String dzialanie = scanner.next();
            if("zwrocWynik".equalsIgnoreCase(dzialanie)){
                System.out.println("poprzedni wynik to " + kalkulator.zwrocWynikOstatniegoDzialania());
                break;
            }
        System.out.println("podaj pierwszą liczbę");
        double liczba1 = scanner.nextDouble();
        System.out.println("podaj drugą liczbę");
        double liczba2 = scanner.nextDouble();

        switch(dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczba1, liczba2);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczba1, liczba2);
                break;
            case "pomnoz":
                wynik = kalkulator.pomnoz(liczba1, liczba2);
                break;
            case "podziel":
                try {
                    wynik = kalkulator.podziel(liczba1, liczba2);
                    System.out.println("Wynik = " + wynik);
                } catch(ArithmeticException nazwaZmiennejWyjatku) {
                    System.out.println("Nie można dzielic przez zero");
                }
                break;
            default:
                System.out.println("Niepoprawna komenda");
        }

        }while(wynik != null);{
            System.out.println("Wynik = " + wynik);


}}}
