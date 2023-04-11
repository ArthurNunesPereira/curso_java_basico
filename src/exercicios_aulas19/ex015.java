package exercicios_aulas19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex015 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		
		int Array1 [] = new int[10];
		int impar = 0;
		int par = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			
			if (Array1[i] % 2 ==0) {
				par++;
			} else {
				impar++;
			}
		}
		double porcPar = (par * 100)/Array1.length;
        double porcImpar = 100 - porcPar;
		System.out.println("A porcentagem de valores pares do Array1 é de: " + formatador.format(porcPar) + "%");
		System.out.println("A porcentagem de valores impares do Array1 é de: " + formatador.format(porcImpar) + "%");
	}
}
