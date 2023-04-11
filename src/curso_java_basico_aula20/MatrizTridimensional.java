package curso_java_basico_aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int Matriz1 [] [] [] = new int [3] [3] [3];
		
		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				for (int k = 0; k < Matriz1[i][j].length; k++) {
					Matriz1[i][j][k] = i + j + k; // Matriz tridimensional recebendo as posições
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
				}
			}
		}	
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i = 0; i < Matriz1.length; i++) {
			for (int j = 0; j < Matriz1[i].length; j++) {
				for (int k = 0; k < Matriz1[i][j].length; k++) {
					
					soma += Matriz1[i][j][k];
					
					if (Matriz1[i][j][k] % 2 == 0) {
						somaPares += Matriz1[i][j][k];
					} else {
						somaImpares += Matriz1[i][j][k];
					}
				}
			}
		}	
		System.out.println("Soma dos indices da matriz: " +  soma);
		System.out.println("Soma dos valores pares da matriz: " +  somaPares);
		System.out.println("Soma dos valores impares da matriz: " +  somaImpares);
	}
}
