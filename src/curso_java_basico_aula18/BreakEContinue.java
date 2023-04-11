package curso_java_basico_aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Break
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		System.out.println("Entre com um número:");
		int max = scan.nextInt();
		
		for (int i = num; i<=max; i++) {
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}
		
		//Continue
		System.out.println("Entre com um número:");
		int numero = scan.nextInt();
		System.out.println("Entre com um número:");
		int maximo = scan.nextInt();
		
		for (int i = numero; i<=maximo; i++) {
			
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
	}
}
