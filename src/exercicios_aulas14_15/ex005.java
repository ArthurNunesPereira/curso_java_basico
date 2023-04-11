package exercicios_aulas14_15;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do bimestre:");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do bimestre:");
		double n2 = scan.nextDouble();
		double soma = n1 + n2;
		double media = soma / 2;
		
		if(media < 7) {
		System.out.println("Reprovado");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Aprovado com Distinção!");
		}
	}

}
