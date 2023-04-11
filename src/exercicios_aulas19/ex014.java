package exercicios_aulas19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int impar = 0;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			
			if (Array1[i] % 2 ==0)
			soma += Array1[i];
		}
		media = soma / Array1.length;
		System.out.println("A soma de valores do Array1 é de: " + soma);
		System.out.println("A media de valores do Array1 é de: " + media);
	}
}
