package exercicios_aulas11_13;

import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida de um dos lados do quadrado que quer saber a área:");
		int lado = scan.nextInt();
		int area = lado * lado;
		
		System.out.println("A área do quadrado é = " + area);
		System.out.println("E o dobro da área do quadrado é = " + (area * 2));
	}

}
