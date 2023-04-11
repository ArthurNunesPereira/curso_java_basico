package exercicios_aulas19;

import java.util.Scanner;

public class ex022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int [10];
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com números pares:");
			Array1[i] = scan.nextInt();
			
			if (Array1[i] % 2 != 0) {
				System.out.println("Valor invalido digitado, por favor tente novamente!");
				break;
			}
		}
		
		System.out.print("Array1: [");
		
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + " ");
		}
		System.out.println("].");
	}
}
