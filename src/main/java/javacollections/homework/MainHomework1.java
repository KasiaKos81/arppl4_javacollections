package javacollections.homework;

import java.util.*;

public class MainHomework1 {

    // stworz listę Integerów. Wykonaj zadania:
    //  - dodaj do listy 5 elementów ze scannera
    // - dodaj do listy 5 elementów losowych
    // - wypisz elementy
    //  sprawdz dzialanie aplikacji

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " z 5 liczb: ");
            int liczba = scanner.nextInt();
            list.add(liczba);

            // lista.add(scanner.nextInt();
        }
        // Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt(5));
        }
        //lista.add((generator.nextInt());

        System.out.println(list);
    }
}




