package exercicios_aulas14_15;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que você estuda M-Matutino, V-Vespertino ou N-Noturno:");
		String turno = scan.next();

		if (turno.equals("M") || turno.equals("m")) {
			System.out.println("Matutino");
		} else if (turno.equals("V") || turno.equals("v")) {
			System.out.println("Vespertino");
		} else if (turno.equals("N") || turno.equals("n")) {
			System.out.println("Noturno");
		} else {
			System.out.println("[ERRO] Por favor insira um turno válido!");
		}

	}

}
