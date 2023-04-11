package exercicios_aulas20;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Matriz1[][] = new int[3][3];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				System.out.print("Entre com um número para a linha " + i + " coluna " + j);
				Matriz1[i][j] = scan.nextInt();

				if (Matriz1[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}

		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				System.out.print(Matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A quantidade de número pares da Matriz1 é de: " + par);
		System.out.println("A quantidade de número ímpares da Matriz1 é de: " + impar);
	}
}
