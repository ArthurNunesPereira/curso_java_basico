package curso_java_basico_aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// Construtor da classe
	public Carro() { 
		System.out.println("Classe carro foi instanciada");
		numPassageiros = 4;
	}
	
	// Construtor com parametros
	public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) { 
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	
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
