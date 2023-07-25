package curso_java_basico_aula20.labs;

import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char jogoDaVelha[][] = new char[3][3];
		boolean vencedor = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0; // Declarando duas variavéis na mesma linha.

		System.out.println("---Jogo da Velha---");
		System.out.println("Player 1 - [X].");
		System.out.println("Player 2 - [O].");
		while (!vencedor) {

			if (jogada % 2 != 0) {
				System.out.println("Vez do player [X]. Escolha uma linha e coluna (1 - 3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do player [O]. Escolha uma linha e coluna (1 - 3).");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Selecione uma linha (1 - 3):");
				linha = scan.nextInt();

				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("A linha selecionada é inválida, por favor tente novamente!");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Selecione uma coluna:");
				coluna = scan.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("A coluna selecionada é inválida, por favor tente novamente!");
				}
			}

			linha--;
			coluna--;
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Este espaço ja está preenchido, por favor tente novamente!");
			} else {
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}

			System.out.println("---Jogo da Velha---");
			for (int i = 0; i < jogoDaVelha.length; i++) {
				System.out.print("   | ");
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// Checar se alguém ganhou
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||     // Linha 1
					(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // Linha 2
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // Linha 3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // Coluna 1
					(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // Coluna 2
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // Coluna 3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // Diagonal 1
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X')){  // Diagonal 2
				vencedor = true;
				System.out.println("O vencedor foi o Player [X]!");
			} else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // Linha 1
					(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || 	// Linha 2
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || 	// Linha 3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || 	// Coluna 1
					(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || 	// Coluna 2
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || 	// Coluna 3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || 	// Diagonal 1
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O')){  	// Diagonal 2
				vencedor = true;
				System.out.println("O vencedor foi o Player [O]!");
			} else if (jogada > 9) {
				vencedor = true;
				System.out.println("Nenhum vencedor, deu velha!");
			}
		}
	}
}
