package curso_java_basico_aula33.labs;

public class JogoDaVelha {

	private char jogoDaVelha[][];
	private int jogada;

	public JogoDaVelha() {
		jogoDaVelha = new char[3][3];
		jogada = 1;
	}	
	
	public char[][] getJogoDaVelha() {
		return this.jogoDaVelha;
	}

	public void setJogoDaVelha(char[][] jogoDaVelha) {
		this.jogoDaVelha = jogoDaVelha;
	}

	public int getJogada() {
		return this.jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public boolean validarJogada(int linha, int coluna, char sinal) {

		if (jogoDaVelha[linha][coluna] == sinal || jogoDaVelha[linha][coluna] == 'O') {
			return false;
		} else {
			jogoDaVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}

	public void imprimirTabuleiro() {

		System.out.println("---Jogo da Velha---");
		for (int i = 0; i < jogoDaVelha.length; i++) {
			System.out.print("   | ");
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean verificarGanhador(char sinal) {

		if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) || // Linha 1
			(jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) || // Linha 2
			(jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) || // Linha 3
			(jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) || // Coluna 1
			(jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) || // Coluna 2
			(jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) || // Coluna 3
			(jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) || // Diagonal 1
			(jogoDaVelha[2][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[0][2] == sinal)) { // Diagonal 2
			return true;
		}
		return false;
	}
	
	public boolean vezJogador1() {
		if (jogada % 2 != 0) {
			return true;
		}
		return false;
	}
}