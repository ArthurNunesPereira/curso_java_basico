package exercicios_aulas16_17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite a quantidade de itens que o cliente esta comprando:");
		int qtdProdutos = scan.nextInt();
		System.out.println("Digite o valor do pão:");
		double item = scan.nextDouble();
		
		if (qtdProdutos < 50) {
			for (int i = 1; i <= qtdProdutos; i++) {
				System.out.println(i + " - R$: " + formatador.format(item));
				item += item;
			}
		} else {
			System.out.println("Quantidade máxima de compra 50 itens");
		}
	}
}
