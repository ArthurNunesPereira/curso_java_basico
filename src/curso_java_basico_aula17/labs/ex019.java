package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos números quer analisar:");
		int ana = scan.nextInt();
		int num;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < ana; i++) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			soma += num;
			media = soma / ana;	
		}
		System.out.println("Foram digitados " + ana + " números.");
		System.out.println("O média dos números foi: " + media);
	}
}
