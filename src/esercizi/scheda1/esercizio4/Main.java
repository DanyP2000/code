package esercizi.scheda1.esercizio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di secondi: ");

        int secondi = scanner.nextInt();

        String giorniOreMinutiSecondi = Secondi.secondiToGiorniOreMinutiSecondi(secondi);

        System.out.println(secondi + " secondi sono equivalenti a: " + giorniOreMinutiSecondi);
    }
}
