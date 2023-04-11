package exercicios_aulas19;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int[5];
		int Array2 [] = new int[5];
	
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			Array2[i] = Array1[i];
		}
		
		
		for (int j = 0; j <= Array1.length; j++) {
			 System.out.print("Os valores do Array1 são posição: " + j + " valor: " + Array1[j] + " / ");
			 System.out.println("Os valores do Array2 são posição: " + j + " valor: " + Array2[j]);
		 }
	}
}

