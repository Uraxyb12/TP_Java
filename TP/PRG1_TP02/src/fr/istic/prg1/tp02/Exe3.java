package fr.istic.prg1.tp02;

import java.util.Scanner;

public class Exe3 {
	// Annee bissextile

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int annee = scan.nextInt();

		if (annee%4 == 0 && annee%100 != 0){
			System.out.println("L'année est bissextile");
		} else if (annee%400 == 0){
			System.out.println("L'année est bissextile");
		} else {System.out.println("L'année n'est pas bissextile");}

		scan.close();
	}
}
