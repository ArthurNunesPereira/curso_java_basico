package curso_java_basico_aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}

	public double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel (double km) { // Metodo privado criado para fazer o calculo
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km); 
		// Retornando o método (consegue acessar por que é da mesma classe) e assim protege o método de alterações indesejadas deixando ele como privado
	}
}
