package curso_java_basico_aula31;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}

	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel; // qtdCombustivel é uma variavel local do metodo calcularCombustivel()
	}
}
