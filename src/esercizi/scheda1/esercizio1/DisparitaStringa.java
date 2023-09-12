package esercizi.scheda1.esercizio1;

/* 1)
Scrivere un metodo che prenda in input una stringa e ritorni
true se la stringa ha lunghezza dispari, false altrimenti. */

public class DisparitaStringa {

    public static boolean disparitaStringa(String s) {
        int lunghezza = s.length();

        if (lunghezza % 2 == 1) {
            return true;

        } else {
            return false;
        }
    }
}
