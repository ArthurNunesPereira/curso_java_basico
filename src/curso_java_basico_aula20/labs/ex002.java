package curso_java_basico_aula20.labs;

public class ex002 {

	public static void main(String[] args) {

		int Matriz1[][] = new int[10][10];
		int maior5 = Integer.MIN_VALUE;
		int menor5 = Integer.MAX_VALUE;
		int maior7 = Integer.MIN_VALUE;
		int menor7 = Integer.MAX_VALUE;

		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				Matriz1[i][j] = (int) Math.round(Math.random() * 9);
				System.out.print(Matriz1[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < Matriz1[5].length; i++) {
			if (Matriz1[5][i] > maior5) {
				maior5 = Matriz1[5][i];
			}

			if (Matriz1[5][i] < menor5) {
				menor5 = Matriz1[5][i];
			}
		}

		for (int i = 0; i < Matriz1.length; i++) {
			if (Matriz1[i][7] > maior7) {
				maior7 = Matriz1[i][7];
			}

			if (Matriz1[i][7] < menor7) {
				menor7 = Matriz1[i][7];
			}
		}

		System.out.println("O maior número da linha 5 é: " + maior5);
		System.out.println("O menor número da linha 5 é: " + menor5);
		System.out.println("O maior número da coluna 7 é: " + maior7);
		System.out.println("O menor número da coluna 7 é: " + menor7);
	}
}
