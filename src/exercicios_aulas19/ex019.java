package exercicios_aulas19;

import java.util.Scanner;

public class ex019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1 [] = new double[10];
		double nota2 [] = new double[nota1.length];
		double result [] = new double[10];
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Entre com a nota: " + i);
			nota1[i] = scan.nextInt();
			System.out.println("Entre com a nota: " + i);
			nota2[i] = scan.nextInt();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		for (int j = 0; j < nota1.length; j++) {
			System.out.print("A media das notas é: " + result[j] + ".");	

			if (result[j] >= 7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
		}
	}
}
