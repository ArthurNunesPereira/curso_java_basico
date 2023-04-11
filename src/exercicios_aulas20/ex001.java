package exercicios_aulas20;

public class ex001 {

	public static void main(String[] args) {

		int Matriz1[][] = new int[4][4];
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				Matriz1[i][j] = (int) Math.round(Math.random() * 9);

				System.out.print(Matriz1[i][j] + " ");

				if (Matriz1[i][j] > maior) {
					maior = Matriz1[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}

		System.out.println("O maior número sorteado foi: " + maior);
		System.out.println("Posição da linha: " + linha);
		System.out.println("Posição da coluna: " + coluna);
	}
}
