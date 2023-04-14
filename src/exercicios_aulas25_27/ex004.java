package exercicios_aulas25_27;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("---Jogo da Velha---");
		System.out.println("Player 1 - [X].");
		System.out.println("Player 2 - [O].");

		boolean vencedor = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!vencedor) {
			if (jogoDaVelha.vezJogador1()) {
				System.out.println("Vez do player [X]. Escolha uma linha e coluna (1 - 3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do player [O]. Escolha uma linha e coluna (1 - 3).");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Este espaço ja está preenchido, por favor tente novamente!");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if (jogoDaVelha.verificarGanhador('X')) {
				vencedor = true;
				System.out.println("O vencedor foi o Player [X]!");
			} else if (jogoDaVelha.verificarGanhador('O')){
					vencedor = true;
					System.out.println("O vencedor foi o Player [O]!");
				} else if (jogoDaVelha.jogada > 9) {
					vencedor = true;
					System.out.println("Nenhum vencedor, deu velha!");
				}
			}
		}
		
		static int valor(String tipoValor, Scanner scan) {
			int valor = 0;
			boolean valorValido = false;
			while (!valorValido) {
				System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
				valor = scan.nextInt();

				if (valor >= 1 && valor <= 3) {
					valorValido = true;
				} else {
					System.out.println("Entrada inválida, tente novamente!");
				}
			}
			valor--;
			return valor;
		}

	}
