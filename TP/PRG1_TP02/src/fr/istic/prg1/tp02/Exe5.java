package fr.istic.prg1.tp02;

import java.util.Scanner;

public class Exe5 {
	// Conversion secondes

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nombre = scan.nextInt();

		int jours = nombre/86400;
		nombre = nombre%86400;

		int heures = nombre/3600;
		nombre = nombre%3600;

		int minutes = nombre/60;
		int secondes = nombre%60;

		System.out.println(jours+"Jours "+heures+"Heures "+minutes+"Minutes "+secondes+"Secondes");
	}
}
