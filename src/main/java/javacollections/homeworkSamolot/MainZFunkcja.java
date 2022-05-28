package javacollections.homeworkSamolot;

import java.util.Scanner;

public class MainZFunkcja {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj literę: ");
            String slowo = scanner.next();
            WeryfikatorNumeruMiejsca weryfikator = new WeryfikatorNumeruMiejsca(4, 'F');

            boolean wynik = weryfikator.sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(slowo);
            if(wynik) {
                System.out.println("Wprowadzone dane (wejście) są poprawne");
            }else{
                System.out.println("Wprowadzone dane (wejście) są niepoprawne");
            }
        }

    }



