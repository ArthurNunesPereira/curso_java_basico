package exercicios_aulas20;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String Matriz1[][] = new String[31][24];
		boolean sair = false;
		byte opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();

			if (opcao == 1) { // Add compromisso
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o horário do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Horário inválido, digite novamente!");
					}
				}

				dia--; // Como o Array começa na posição zero, e o usuário vai digitar dias normais,
						// vamos reduzir 1 para acessarmos a posição correta do Array
				System.out.println("Digite o compromisso:");
				Matriz1[dia][hora] = scan.next();

			} else if (opcao == 2) { // Verifica compromisso
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o horário do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Horário inválido, digite novamente!");
					}
				}

				dia--;
				System.out.println("Compromisso do dia " + dia + " às " + hora + " horas é: " + Matriz1[dia][hora]);

			} else if (opcao == 0) { // Sair
				sair = true;
				System.out.println("Fim.");
			} else {
				System.out.println("Valor inválido digitado, por favor tente novamente.");
			}
		}
	}
}
