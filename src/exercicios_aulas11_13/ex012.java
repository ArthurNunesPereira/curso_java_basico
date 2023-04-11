package exercicios_aulas11_13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Vamos calcular seu peso ideal através da sua altura:");
		double altura = scan.nextDouble();
		
		double pIdeal = 72.7 * altura - 58;
		
		System.out.println("Seu peso ideal é: " + formatador.format(pIdeal));
	}

}
