package curso_java_basico_aula27;

// Declaração da Classe e seus atributos
public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumocombustivel;
	
	// Declaração dos métodos
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumocombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumocombustivel;
		
		return qtdCombustivel;
	}
}
