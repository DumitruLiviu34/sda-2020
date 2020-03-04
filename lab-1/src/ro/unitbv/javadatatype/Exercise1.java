package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		Scanner scanner = new Scanner(System.in);
		
		// afiseaza mesajul in consola
		System.out.println("Introdu sumanr1+nr2: ");
		System.out.println("Introdu differencenr1-nr2: ");
		System.out.println("Introdu productnr1*nr2: ");
		System.out.println("Introdu impartirenr1/nr2: ");
		int nr1 = scanner.nextInt();
		int nr2 = scanner.nextInt();
		
		// afisam output-ul
		System.out.println("numarul citit este: "+nr1);
		System.out.println("numarul citit este: "+nr2);
		int sum = nr1+nr2;
		int difference = nr1-nr2;
		int product = nr1*nr2;
		double impartire = (double)nr1/nr2;
		int impartireInt = nr1/nr2;
		System.out.println("sumanr1+nr2: "+(nr1+nr2));
		System.out.println("differencenr1-nr2: "+(nr1-nr2));
		System.out.println("productnr1*nr2: "+(nr1*nr2));
		System.out.println("impartirenr1/nr2: "+(nr1/nr2));
	}
}
