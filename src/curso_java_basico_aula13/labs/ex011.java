package curso_java_basico_aula13.labs;

import java.util.Scanner;
import java.lang.Math;
public class ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = scan.nextInt();
		System.out.println("Digite um número real:");
		float n3 = scan.nextFloat();
		
		float a = 2 * n1 * n2 / 2;
		float b = 3 * n1 + n3;
		double c = Math.pow(n3,3);
		
		System.out.println("O produto do dobro de: " + n1 + " e " + n2 + " é: " + a);
		System.out.println("A soma do triplo de: " + n1 + " + " + n3 + " é: " + b);
		System.out.println(n3 + "³ = " + c);
	}

}
