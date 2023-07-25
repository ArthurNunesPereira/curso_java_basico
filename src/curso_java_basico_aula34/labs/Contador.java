package curso_java_basico_aula34.labs;

public class Contador {
	
	private static int valorContador;
	
	public Contador() { // Incrementar toda vez que a classe for instanciada
		valorContador++;
	}
	
	public static void zerarContador() {
		valorContador = 0;
	}
	
	public static void incrementarContador() {
		valorContador++;
	}
	
	public static int obterValor() {
		return valorContador;
	}
}
