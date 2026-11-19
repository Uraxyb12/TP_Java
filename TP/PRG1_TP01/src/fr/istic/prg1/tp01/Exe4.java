package fr.istic.prg1.tp01;

import java.util.Scanner;

// Importer ici les bibliothèques nécessaires aux scanners

public class Exe4 {
    // Operations de base sur les nombres entiers, à virgule, et les booleens

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre A");
        int nombreA = scan.nextInt();
        System.out.println("Entrez un nombre B");
        int nombreB = scan.nextInt();
        System.out.println(nombreA + " " + nombreB);

        int nombreC = nombreA;
        nombreA = nombreB;
        nombreB = nombreC;
        System.out.println(nombreA + " " + nombreB);

        System.out.println(nombreA * nombreA + " " + nombreB / 2);
        System.out.println(nombreA / nombreB + " " + nombreA % nombreB);
        System.out.println(nombreA < nombreB);
        System.out.println(nombreA >= nombreB);
        
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(d - c);
        System.out.println(c * d);

        System.out.println(nombreA + c);
        System.out.println(nombreA - c);
        System.out.println(c - nombreA);
        System.out.println(nombreA * c);
        System.out.println(nombreA < c);
        System.out.println(nombreA >= c);

        boolean e = scan.nextBoolean();
        boolean f = scan.nextBoolean();

        System.out.println(e);
        System.out.println(!e);
        System.out.println(e & f);
        System.out.println(e | f);

        scan.close();
    }
}
