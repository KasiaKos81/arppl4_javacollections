package javacollections.ZadanieZAutem;

public class Car {

    private String numerRejestracyjny;

    public Car(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numerRejestracyjny='" + numerRejestracyjny + '\'' +
                '}';
    }
}
