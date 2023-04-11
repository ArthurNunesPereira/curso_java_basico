package exercicios_aulas14_15;

import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota do bimestre:");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do bimestre:");
		double n2 = scan.nextDouble();
		double soma = n1 + n2;
		double media = soma / 2;
		
		if (media <= 4) {
			System.out.println("Nota E - REPROVADO");
		} else if (media >= 4 && media < 6) {
			System.out.println("Nota D - REPROVADO");
		} else if (media >= 6 && media < 7.5) {
			System.out.println("Nota C - APROVADO");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("Nota B - APROVADO");
		} else if (media >= 9 && media <= 10) {
			System.out.println("Nota A - APROVADO");
		}
	}

}
