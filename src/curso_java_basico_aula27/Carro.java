package curso_java_basico_aula27;

// Declaração da Classe e seus atributos
public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// Declaração dos métodos
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
