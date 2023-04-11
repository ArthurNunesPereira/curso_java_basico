package exercicios_aulas16_17;

import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um número:");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de números pares:" + par);
		System.out.println("Quantidade de números ímpares:" + impar);
	}

}
