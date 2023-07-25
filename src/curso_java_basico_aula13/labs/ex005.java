package curso_java_basico_aula13.labs;

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
