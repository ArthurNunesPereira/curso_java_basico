package curso_java_basico_aula35;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		int fatorialNR = MinhaCalculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = MinhaCalculadora.fatorialRecursivo(5);
		System.out.println(fatorialR);
	}
}
