package javacollections.homworkListaZadan;

import java.time.LocalDateTime;

public class Zadanie {

    private String nazwa;
    private String tresc;
    private LocalDateTime czasDodania;
    private Zrealizowane stan;

    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.czasDodania = LocalDateTime.now();
        this.stan = Zrealizowane.NIE;
    }

    public Zrealizowane getStan() {
        return stan;
    }

    public void setStan(Zrealizowane stan) {
        this.stan = stan;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public LocalDateTime getCzasDodania() {
        return czasDodania;
    }

    public void setCzasDodania(LocalDateTime czasDodania) {
        this.czasDodania = czasDodania;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", czasDodania=" + czasDodania +
                '}';
    }
}


