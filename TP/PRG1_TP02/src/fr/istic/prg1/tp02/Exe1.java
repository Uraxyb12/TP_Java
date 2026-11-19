package fr.istic.prg1.tp02;

import java.util.Scanner;

public class Exe1 {
	// Affichage de la plus grande valeur de deux entiers

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

	if(a<b){
		System.out.println("La plus grande valeur est b");
	} else {System.out.println("La plus grande valeur est a");}

	scan.close();
	}
}
