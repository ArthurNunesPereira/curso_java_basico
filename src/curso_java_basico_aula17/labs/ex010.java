package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos imprimir todos os números no intervalo de um a outro por você digitado:");
		System.out.println("Digite o primeiro número(início):");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo número(fim):");
		int n2 = scan.nextInt();
		
		int intervalo = n1;
		for (;intervalo <= n2; intervalo++) {
			System.out.println(intervalo);
		}
	}
}
