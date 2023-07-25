package curso_java_basico_aula19.labs;

import java.util.Scanner;

public class ex026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int [10];
		char Array2 [] = new char [Array1.length];
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com números pares:");
			Array1[i] = scan.nextInt();
			
			if (Array1[i] < 7) {
				Array2[i] = 'a';
			} else if (Array1[i] == 7) {
				Array2[i] = 'b';
			} else if (Array1[i] > 7 && Array1[i] < 10) {
				Array2[i] = 'c';
			} else if (Array1[i] == 10) {
				Array2[i] = 'd';
			} else if (Array1[i] > 10) {
				Array2[i] = 'e';
			}
		}
		
		System.out.print("Array1: [");
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + " ");
		}
		System.out.println("].");
		
		System.out.print("Array2: [");
		for (int k = 0; k < Array2.length; k++) {
			System.out.print(Array2[k] + " ");
		}
		System.out.println("].");
	}
}
