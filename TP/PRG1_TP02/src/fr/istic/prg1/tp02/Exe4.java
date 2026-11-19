package fr.istic.prg1.tp02;

import java.util.Scanner;

public class Exe4 {
	// Affichage dans l'ordre croissant

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int petit = 0;
		int moyen = 0;
		int grand = 0;

		if (a > b | a > c){
			if (a > b & a > c){
				grand = a;
			} else {moyen = a;}
		} else {petit = a;}

		if (b > a | b > c){
			if (b > a & b > c){
				grand = b;
			} else {moyen = b;}
		} else {petit = b;}

		if (c > b | c > a){
			if (c > b & c > a){
				grand = c;
			} else {moyen = c;}
		} else {petit = c;}

		System.out.println(petit+"<="+moyen+"<="+grand);

		scan.close();
	}
}
