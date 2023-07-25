package curso_java_basico_aula13.labs;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celcius:");
		double tempC = scan.nextDouble();
		double tempF = tempC * 9/5 + 32;
		
		System.out.println("A temperatura em graus Farenheti é: " + tempF);

	}

}
