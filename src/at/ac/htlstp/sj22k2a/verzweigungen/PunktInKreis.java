package at.ac.htlstp.sj22k2a.verzweigungen;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Lies einen Kreis (x,y Koordinate von Mittelpunkt und Radius) und einen Punkt ein und bestimme ob dieser Punkt innerhalb des Kreise liegt!
 *
 * Lies der Reihe nach ein: Mittelpunkt x, Mittelpunkt y, Radius, zweiter Punkt x, zweiter Punkt y
 *
 * Als Antwort gibt entweder "innerhalb des Kreises" oder "außerhalb des Kreises" aus!
 */

public class PunktInKreis {

    public static void main(String[] args) {

        //Eingabe
        Scanner sc = new Scanner(System.in);
        double mx,my,r,px,py,a;

        System.out.print("Mx= ");
        mx = sc.nextInt();
        System.out.print("My= ");
        my = sc.nextInt();
        System.out.print("r= ");
        r = sc.nextInt();
        System.out.print("Px= ");
        px = sc.nextInt();
        System.out.print("Py= ");
        py = sc.nextInt();

        //Verarbeitung

        a = Math.sqrt((px-mx)*(px-my))+((py-my)*(py-mx));

        //Aufräumen
        sc.close();

        //elseif-Kette

        if (a<=r){
            System.out.print("innerhalb des Kreises");
        } else {
            System.out.print("außerhalb des Kreises");
        }

    }

}
