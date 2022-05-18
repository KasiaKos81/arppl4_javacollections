package javacollections.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStudenta(){
        Dziennik dziennik = new Dziennik();

        // testujemy ptzypadek w którym nie ma studenta
        try {
            Student s = dziennik.zwrocStudenta("123");
        } catch (BrakStudentaException e) {
            System.out.println("nie znaleziono studenta");
        }
    }
  //  @Test
    ///public void test_zwrocStudentaNull(){
       // Dziennik dziennik = new Dziennik();
        //Student s = dziennik.zwrocStudentaNull("123");

        // System.out.println(s.getNumerIndeksu());
    // }

}