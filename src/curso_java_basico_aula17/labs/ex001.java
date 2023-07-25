package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean numValido = false;
		
		while (!numValido) {
			System.out.println("Digite um número entre [0 - 10]:");
			int num = scan.nextInt();
			if (num >= 0 && num <= 10) {
				numValido = true;
				System.out.println("Você digitou um valor válido! você digitou: " + num);
			} else {
				System.out.println("Este número não é válido por favor tente novamente!");
			}
		}
	}
}

// PROGRAMA NÃO ESTA FUNCIONANDO!!