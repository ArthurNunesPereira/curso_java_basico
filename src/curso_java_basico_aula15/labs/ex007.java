package curso_java_basico_aula15.labs;

import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int n3 = scan.nextInt();
		
		if(n1 > n2) {
		System.out.println("O maior numero é: " + n1);
		} else if (n2 > n3) {
			System.out.println("O maior numero é: " + n2);
		} else {
			System.out.println("O maior numero é: " + n3);
	}
		
		if(n1 < n2) {
			System.out.println("O menor numero é: " + n1);
			} else if (n2 < n3) {
				System.out.println("O menor numero é: " + n2);
			} else {
				System.out.println("O menor numero é: " + n3);
		}
	}

}
