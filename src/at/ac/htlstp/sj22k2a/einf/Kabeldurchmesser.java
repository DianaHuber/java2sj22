package at.ac.htlstp.sj22k2a.einf;

import java.util.Scanner;

public class Kabeldurchmesser {

    public static void main(String[] args) {
        //Deklaration
        double r1,l1,y1,a;
        Scanner sc;
        //Initialisierung
        sc = new Scanner(System.in);
        //Einlesen der Werte
        System.out.print("Gib die Kabellänge ein:");
        l1 = sc.nextDouble();
        System.out.print("Gib den Widerstand ein:");
        r1 = sc.nextDouble();
        System.out.print("Gib den spezifischen Leitwert ein:");
        y1 = sc.nextDouble();
        //Berechnung
        a = l1/(y1*r1);
        //Ausgabe
        System.out.printf("Kabeldurchmesser : %8.9f mm2\n",a);
        //Aufräumen
        sc.close();



    }
}
