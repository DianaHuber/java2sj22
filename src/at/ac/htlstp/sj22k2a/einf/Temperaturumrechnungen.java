package at.ac.htlstp.sj22k2a.einf;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches vom Benutzer eine Temperatur in °C abfrägt und dann die Temperatur in Kelvin ausgibt.
 *
 * Verwende eine formatierte Ausgabe mit drei Nachkommastellen!
 */

public class Temperaturumrechnungen {

    public static void main(String[] args) {
        //Deklaration
        double c1, k1;
        Scanner sc;
        //Initialisierung
        sc = new Scanner(System.in);
        //Einlesen der Werte
        System.out.print("Gib die Temperatur in Celsius ein:");
        c1= sc.nextDouble();
        //Berechnung
        k1 = c1+273.15;
        //Ausgabe
        System.out.printf("Temperatur in Kelvin : %8.3f K\n",k1);
        //Aufräumen
        sc.close();
    }
}
