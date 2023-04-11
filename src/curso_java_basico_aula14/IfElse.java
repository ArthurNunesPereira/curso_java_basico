package curso_java_basico_aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		//Estrutura de controle
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
		
		//Estrutura de controle aninhada
		System.out.println("Entre com o preço do item:");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("Está muito caro, não comprar!");
		}
	}

}
