package javacollections.homework;

// chcę, żeby osoba która używa klasy dzienik na pewno obsłuzyła sytuację, gdy nie znajdziemy studenta

public class BrakStudentaException extends Exception{
    public BrakStudentaException(String numerIndeksu) {
        super("nie znaleziono studenta o numerze " + numerIndeksu);
    }
}
