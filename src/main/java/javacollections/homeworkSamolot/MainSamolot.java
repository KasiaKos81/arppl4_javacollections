package javacollections.homeworkSamolot;

import java.util.Scanner;

// Stwórz program, w programie wczytuj od użytkownika wejście którym jest litera/token/linia.
//a. Jeśli użytkownik wprowadził więcej znaków, wypisz komunikat o błędzie
//b. Jeśli użytkownik nie wprowadził litery, wypisz komunikat o błędzie
//c. Jeśli użytkownik wprowadził literę, upewnij się że jest z zakresu A-D (może być A, B, C, D)
//d. Jeśli litera jest spoza tego zakresu, to wypisz komunikat o błędzie. Wypisz komunikat o
//błędzie również gdy użytkownik użył małych liter.
//2. Stwórz program podobny do powyższego, ponownie wczytaj od użytkownika wejście. Tym
//razem upewnij się, że użytkownik wpisał dokładnie dwa znaki. Jeśli wpisał:
//a. Więcej znaków = błąd,
//b. Mniej znaków = błąd,
//c. Pierwsza litera wprowadzonego tokenu/frazy/linii musi być literą, jeśli nie => błąd,
//d. Pierwsza litera musi być z zakresu A-F (6 liter), wielkie litery, jeśli nie => błąd
//e. Druga litera może być czymkolwiek

public class MainSamolot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj litereę: ");
        String slowo = scanner.next();


        if(slowo.length() == 1){  // jak tu damy po ==2 to wychodzi drugie rozwiązanie
            char znak = slowo.charAt(0);

            if(znak >= 'A' && znak <= 'D'){
                System.out.println("litera jest OK");
            } else {
                System.out.println("litera jest nie OK");
            }
        }
        // Stwórz program podobny do powyższego. Tym razem upewnij się, że użytkownik wpisał
        //dokładnie dwa znaki. Jeśli wpisał:
        //a. Więcej znaków = błąd,
        //b. Mniej znaków = błąd,
        //c. Pierwsza litera wprowadzonego tokenu/frazy/linii musi być literą, jeśli nie => błąd,
        //d. Pierwsza litera musi być z zakresu A-F (6 liter), wielkie litery, jeśli nie => błąd
        //e. Drugi znak musi być cyfrą. Możesz to sprawdzić przez:
        //i. Sprawdzenie kodów ASCII
        //ii. Integer.parseInt – (rzuci exception jeśli wybrane znaki nie mogą być sparsowane
        //do liczby typu integer, wtedy należy przechwycić exception i wiemy że
        //wprowadzona informacja jest błędna)
        //iii. Integer.valueOf – (rzuci exception jeśli wybrane znaki nie mogą być spars

        if (slowo.length() == 2) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                char znakDrugi = slowo.charAt(1);
                if (znakDrugi >= '0' && znakDrugi <= '9') {
                    System.out.println("Znak drugi jest cyfrą!");
                } else {
                    System.out.println("Znak drugi nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }

        // a to juz jest podpunkt 4
            if (slowo.length() > 1 && slowo.length() < 4) {
                char znak = slowo.charAt(0);

                if (znak >= 'A' && znak <= 'F') {
                    System.out.println("Litera jest ok!");

                    String pozaPierwszymZnakiem = slowo.substring(1);
                    try{
                        int liczba = Integer.parseInt(pozaPierwszymZnakiem);
                        System.out.println("wszystko poza pierwszym znakiem jest cyfrą");
                    } catch (NumberFormatException nfe){
                        System.out.println("wszystko poza pierwszym znakiem jest cyfrą");
                    }
                }


    }}}

