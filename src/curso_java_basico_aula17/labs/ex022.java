package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de discos que possui na sua coleção:");
		int qtdDiscos = scan.nextInt();
		double valorPago = 0;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < qtdDiscos; i++) {
			System.out.println("Digite quanto pagou nesse disco:");
			valorPago = scan.nextDouble();
				soma += valorPago;
				media = soma / qtdDiscos;
		}
		System.out.println("O valor médio de discos da sua coleção é: " + media);
	}
}
