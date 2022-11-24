package at.ac.htlstp.sj22k2a.verzweigungen;


import java.util.Scanner;

/**
 * Schaue ob der Punkt C auf der Gerade zwischen Punkt A und B liegt.
 */
public class Gerade {

    public static void main(String[] args) {

        //Eingabe
        Scanner sc= new Scanner(System.in);
        double xa,xb,xc,ya,yb,yc,p,d,k;

        System.out.print("Gib den Punkt xa ein:");
        xa = sc.nextDouble();
        System.out.print("Gib den Punkt ya ein:");
        ya = sc.nextDouble();
        System.out.print("Gib den Punkt xb ein:");
        xb = sc.nextDouble();
        System.out.print("Gib den Punkt yb ein:");
        yb = sc.nextDouble();
        System.out.print("Gib den Punkt xc ein:");
        xc = sc.nextDouble();
        System.out.print("Gib den Punkt yc ein:");
        yc = sc.nextDouble();

        p = 0.1;

        k = (ya+yb)/(xa-xb);
        d = (-k)*xa+ya;







    }
}
