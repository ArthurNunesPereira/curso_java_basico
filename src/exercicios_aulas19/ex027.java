package exercicios_aulas19;

import java.util.Scanner;

public class ex027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int [10];
		int Array2 [] = new int [Array1.length];
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com número para o Array1:");
			Array1[i] = scan.nextInt();
			Array2[Array1.length - 1 - i] = Array1[i];
			
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
