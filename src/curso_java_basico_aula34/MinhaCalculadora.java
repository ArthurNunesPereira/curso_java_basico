package curso_java_basico_aula34;

public class MinhaCalculadora { //Classe utilitária quebra um pouco o paradigma de POO, mas mesmo assim é um recurso que pode ser utilizado.

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int soma(int[] vetorInteiros) {
		int total = 0;
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			total += vetorInteiros[i];
		}
		return total;
	}
}
