package javacollections.homworkListaZadan;

import javacollections.zadanieZKoszykiem.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaZadanDoZrealizowania {
    List<Zadanie> lista = new ArrayList<>();

    //znajdź i wypisz zadanie po jego pełnej nazwie
    public void wypiszZadanaPoPelnejNazwie(String szukanaNazwa) {
        for (Zadanie zadanieNaLiscie : lista) {
            if (zadanieNaLiscie.getNazwa().equals(szukanaNazwa)) {
                System.out.println("Zadanie z hybrydą " + zadanieNaLiscie);
            }
        }
    }
    // dodaj zadanie
    public void dodajZadanie(Zadanie zadanieDoDodania) {
        lista.add(zadanieDoDodania);
    }

    // znajdź i wypisz zadanie po fragmencie nazwy
    public void szukaniePoFragmencieNazwy(String szukanyFragment) {
        for (Zadanie zadanieNaLiscie : lista) {
            if (zadanieNaLiscie.getNazwa().contains(szukanyFragment)) {
                System.out.println(zadanieNaLiscie); // to wywalic przy pisaniu kolejnej funkcji
           //     zadanieNaLiscie.setStan(Zrealizowane.NIE); //zmiana stanu zadania
            }
        }
    }
// zwróć zadanie po pełnej nazwie
    public Optional<Zadanie> zwrocZadanaPoPelnejNazwie(String szukanaNazwa) {
        for (Zadanie zadanieNaLiscie : lista) {
            if (zadanieNaLiscie.getNazwa().equals(szukanaNazwa)) {
                return Optional.of(zadanieNaLiscie);
            }
        }
        return Optional.empty();
    }

    // zwróć zadanie po szukanej frazie, która może być częścią nazwy
    public Optional <Zadanie> zwrocZadaniePoFrazie(String szukanaFraza){
        for (Zadanie zadanieNaLiscie : lista) {
            if(zadanieNaLiscie.getNazwa().contains(szukanaFraza)){
                return Optional.of(zadanieNaLiscie);
            }
        }
        return Optional.empty();
    }
    // usuwanie zadania
   public void  usunZadanie(String nazwaZadania) {
       for (Zadanie zadanieNaLiscie : lista) {
           if (zadanieNaLiscie.getNazwa().equals(nazwaZadania)) {
               lista.remove(zadanieNaLiscie);
           }
       }
   }
       public void oznaczJakoZrealizowane(String nazwa){
           for (Zadanie zadanieNaLiscie : lista) {
               if(zadanieNaLiscie.getNazwa().equals(nazwa)){
               zadanieNaLiscie.setStan(Zrealizowane.TAK);

           }
           }

        }}



