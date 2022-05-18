package javacollections.homework;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {

    private List<Student> lista = new ArrayList<>();

    public void dodajStudenta(Student student) {
        lista.add(student);
    }

    public void usunStudenta(Student student) {
        lista.remove(student);
    }

    public void usunStudenta(String numerIndeksu) {
        System.out.println("usuwam studenta");
        for (int i = 0; i < lista.size(); i++) {
            String numerIndeksuStudentaI = lista.get(i).getNumerIndeksu();
            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                lista.remove(i);
                return;
            }

        }
        System.out.println("nie znaleziono studenta");
    }

    public Student zwrocStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                return sprawdzanyStudentI;
            }

        }
        throw new BrakStudentaException(numerIndeksu);
    }
    public double podajSredniaStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                double srednia = sprawdzanyStudentI.obliczSrednia();
                return srednia;
            }
        } throw new BrakStudentaException(numerIndeksu);

    }
    public void wypisz(){
        System.out.println("lista studentów");
        for (Student student : lista) {
            System.out.println(student);

        }
    }


}