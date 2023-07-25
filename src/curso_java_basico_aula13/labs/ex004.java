package curso_java_basico_aula13.labs;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do bimestre:");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do bimestre:");
		double n2 = scan.nextDouble();
		System.out.println("Digite a terceira nota do bimestre:");
		double n3 = scan.nextDouble();
		System.out.println("Digite a quarta nota do bimestre:");
		double n4 = scan.nextDouble();
		double soma = n1 + n2 + n3 + n4;
		double media = soma / 4;
		System.out.println("A sua média de notas é: " + media);
	}

}
