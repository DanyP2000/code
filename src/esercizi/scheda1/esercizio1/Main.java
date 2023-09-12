package esercizi.scheda1.esercizio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");

        String s = scanner.nextLine();

        boolean disparita = DisparitaStringa.disparitaStringa(s);

        System.out.println("La stringa è dispari? " + (disparita ? "Sì" : "No"));
    }

}