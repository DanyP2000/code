package esercizi.scheda1.esercizio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");

        int numero = scanner.nextInt();

        System.out.println("Il fattoriale di " + numero + " è: " + Fattoriale.fattoriale_ricorsivo(numero));
    }
}
