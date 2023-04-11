package exercicios_aulas19;

import java.util.Scanner;

public class ex029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int [20];
		int Array2[] = new int [Array1.length]; // Pares
		int Array3[] = new int [Array1.length]; // Impares
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com um número para o Array1:");
			Array1[i] = scan.nextInt();
			
			if (Array1[i] % 2 == 0) {
				Array2[i] = Array1[i];
			} else {
				Array3[i] = Array1[i];
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
		
		System.out.print("Array3: [");
		for (int l = 0; l < Array3.length; l++) {
			System.out.print(Array3[l] + " ");
		}
		System.out.println("].");
	}
}
