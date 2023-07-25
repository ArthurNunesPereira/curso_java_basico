package curso_java_basico_aula35.labs;

import java.util.Scanner;

public class ex001 {

	public static void imprimirFibo() {
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= Fibonacci.getNum() ; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da séria de fibonacci:");
		Fibonacci.setNum(scan.nextInt());
		
		imprimirFibo();
	}
}
