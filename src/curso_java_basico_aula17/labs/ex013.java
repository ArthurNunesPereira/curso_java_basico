package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		int base = scan.nextInt();
		System.out.println("Digite a potência:");
		int pot = scan.nextInt();
		
		int resultado = base;
		
		for(int i = 1; i < pot ; i++) {
			resultado *= base;
		}
		System.out.println("O número " + base + " elevado a " + pot + " é = " + resultado);
	}
}