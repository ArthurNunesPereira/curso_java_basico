package curso_java_basico_aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumocombustivel;
	
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumocombustivel;
	}
}
