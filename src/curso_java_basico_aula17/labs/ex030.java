package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex030 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja ver a tabuada:");
		int num = scan.nextInt();
		System.out.println("Digite o inicio da tabuada:");
		int ini = scan.nextInt();
		System.out.println("Digite o fim da tabuada:");
		int fim = scan.nextInt();
		
		for (int mult = ini; mult <= fim; mult++) {
			int produto = num * mult;
			System.out.println(num + " X " + mult + " = " + produto);
		}
	}
}
