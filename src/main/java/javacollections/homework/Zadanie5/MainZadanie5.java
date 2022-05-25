package javacollections.homework.Zadanie5;

import javacollections.homework.Student;

import java.util.ArrayList;
import java.util.List;

public class MainZadanie5 {
    
    // ​Stwórz klasę Student która posiada pola: 
    //nr indeksu 
    //imie 
    //nazwisko 
    //płeć (wartość enum) 
    // 
    //W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student. 
    //Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek). 
    // 
    //a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a" 
    //b. Spróbuj wypisać elementy stosując pętlę foreach 
    //c. Wypisz tylko kobiety 
    //d. Wypisz tylko mężczyzn 
    //e. Wypisz tylko indeksy osób 
   

    public static void main(String[] args) {

        List<StudentZZadania5> listaStudentow = new ArrayList<>();


        StudentZZadania5 student1 = new StudentZZadania5("567", "Jaroslaw", "Kaczynski", Plec.KOBIETA);
        StudentZZadania5 student2 = new StudentZZadania5("123", "Mateusz", "Morawiecki", Plec.MEZCZYZNA);
        StudentZZadania5 student3 = new StudentZZadania5("789", "Zbigniew", "Ziobro", Plec.MEZCZYZNA);

        listaStudentow.add(student1);
        listaStudentow.add(student2);
        listaStudentow.add(student3);

        System.out.println(listaStudentow);

        for (int i = 0; i < listaStudentow.size(); i++) {
            System.out.println(listaStudentow.get(i));

        }
        System.out.println("tylko kobiety------------------");

        for (int i = 0; i < listaStudentow.size(); i++) {
      //      System.out.println("płec" + listaStudentow.get(i).getPlec());
            if(listaStudentow.get(i).getPlec().equals(Plec.KOBIETA)){
                System.out.println(listaStudentow.get(i));
            }
        }

            }
        }

            






