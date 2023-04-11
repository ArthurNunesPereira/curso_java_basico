package exercicios_aulas16_17;

import java.util.Scanner;

public class ex027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int temp;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		int media = 0;
		int i = 1;
		boolean fimTemp = false;
		
		while (!fimTemp) {
			System.out.println("Entre com a temperatura: " + i);
			temp = scan.nextInt();
			soma += temp;
			media = soma / i;	
			i++;
			
				if (temp > maior) {
					maior = temp;
				}
				
				if (temp < menor && temp != 0) {
					menor = temp;
				}
			
				if (temp == 0) {
					fimTemp = true;
					System.out.println("Deseja continuar a comprar? [s/n]:");
					String continuarCompra = scan.next();
				
					if (continuarCompra.equals("s") ||  continuarCompra.equals("S")) {
						fimTemp = false;
					} else {
						System.out.println("Fim da analise!");
					}
				}	
		}
		System.out.println("A maior temperatura é: " + maior + " Cº.");
		System.out.println("A menor temperatura é: " + menor + " Cº.");
		System.out.println("A média de temperatura é: " + media + " Cº.");
	}
}
