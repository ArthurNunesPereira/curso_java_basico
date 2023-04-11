package exercicios_aulas16_17;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		int cont = 0;
		boolean valido = false;
		
		do {
			System.out.println("Digite a população do pais A:");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("A população do pais deve ser maior que zero!");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Digite a população do pais B:");
			popB = scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("A população do pais deve ser maior que zero!");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento anual da população do pais A:");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento deve ser maior que zero!");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento anual da população do pais B:");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento deve ser maior que zero!");
			}
		} while (!valido);
		
		while (popA < popB) {
			popA += (popA/100) *  taxaA;
			popB += (popB/100) *  taxaB;
			cont++;
		}
		System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:     " + cont);
	}
}

