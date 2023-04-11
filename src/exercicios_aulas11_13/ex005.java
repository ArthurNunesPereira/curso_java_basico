package exercicios_aulas11_13;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida que quer converter de m para cm:");
		int n1 = scan.nextInt();
		int conversor = n1 * 100;
		System.out.println(n1 + " metros, são: " + conversor + " centimetros.");

	}

}
