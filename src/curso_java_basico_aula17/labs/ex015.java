package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex015 {
// EXERCICIO EXTRA!!
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da séria de fibonacci:");
		int n = scan.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= n ; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
}
