package esercizi.scheda1.esercizio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");

        String parola = scanner.nextLine();

        String parolaInvertita = StringaInversa.invertiStringa(parola);

        System.out.println(parolaInvertita);
    }
}
