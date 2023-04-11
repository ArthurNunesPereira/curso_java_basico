package exercicios_aulas19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex016 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int impar = 0;
		int soma = 0;
		int somaMaiorQuinze = 0;
		int media = 0;
		int igualQuinze = 0;
		int maiorQuinze = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			
			if (Array1[i] < 15) {
			soma += Array1[i];
			}
			
			if (Array1[i] == 15) {
				igualQuinze++;
			}
			
			
			if (Array1[i] > 15) {
				somaMaiorQuinze += Array1[i];
				maiorQuinze++;
			}	
		}
		media = somaMaiorQuinze / maiorQuinze;
		
		System.out.print("Array1: [");
		
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + " ");
		}
		System.out.println("]");
		System.out.println("A soma de valores do Array1 que são inferiores a 15 é de: " + soma);
		System.out.println("A quantidade de elementos do Array1 que são iguais a 15 é de: " + igualQuinze);
		System.out.println("A media de valores dos valores que são superiores a 15 do Array1 é de: " + media);
	}
}

