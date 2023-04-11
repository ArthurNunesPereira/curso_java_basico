package exercicios_aulas19;

import java.util.Scanner;
public class ex031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int [5];
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com um número para o Array1:");
			Array1[i] = scan.nextInt();
		}
		
		System.out.println("Array1:");
		for (int j = 0; j < Array1.length; j++) {
			 System.out.println("Tabuada de " + Array1[j] + ":");
			 
			for (int mult = 0; mult <=10; mult++) {
				int produto = Array1[j] * mult;
				System.out.println(Array1[j] + " X " + mult + " = " + produto);
			}
			System.out.println();
		}
	}
}
