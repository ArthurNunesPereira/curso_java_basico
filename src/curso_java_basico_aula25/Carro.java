package curso_java_basico_aula25;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumocombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumocombustivel + " km.");
	}
}
