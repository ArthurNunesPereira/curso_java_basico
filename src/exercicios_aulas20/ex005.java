package exercicios_aulas20;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Matriz1[][][] = new String[12][31][24];
		boolean sair = false;
		byte opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();

			if (opcao == 1) {

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Entre com o mês:");
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}

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
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				Matriz1[mes][dia][hora] = scan.next();

			} else if (opcao == 2) {

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Entre com o mês:");
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}

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
				
				mes--;
				dia--;
				if (Matriz1[mes][dia][hora] != null) {
					System.out.println("Compromisso do mês " + mes + " dia " + dia + " às " + hora + " horas é: " + Matriz1[mes][dia][hora]);
				} else {
					System.out.println("Nenhuma compromisso marcado nesta data!");
				}

			} else if (opcao == 0) {
				sair = true;
				System.out.println("Fim.");
			} else {
				System.out.println("Valor inválido digitado, por favor tente novamente.");
			}
		}
	}
}
