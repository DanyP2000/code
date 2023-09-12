package esercizi.scheda1.esercizio3;

/* 3)
Scrivere un metodo che calcoli il fattoriale di un numero positivo n.
Se l’input è negativo stampare un messaggio di errore. */

public class Fattoriale {

    public static int fattoriale_iterativo(int n) {

        if (n < 0) {
            System.out.println("ERRORE! Input negativo!");
            return -1;
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int fattoriale_ricorsivo (int n) {
        if (n <= 1) {
            return 1;
        }

        return n*fattoriale_ricorsivo(n-1);
    }
}
