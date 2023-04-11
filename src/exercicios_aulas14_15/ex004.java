package exercicios_aulas14_15;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra minuscula:");
		String letra = scan.next();
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("A letra " + letra + " é uma vogal!");
		} else {
			System.out.println("A letra " + letra + " é uma consoante!");
		}
	}

}
