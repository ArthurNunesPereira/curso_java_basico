package exercicios_aulas19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			
			if (Array1[i] % 5 == 0) {	
				soma += Array1[i];
			}
		}
		System.out.println("A quantidade de valores pares no Array1 é de: " + soma);
	}
}