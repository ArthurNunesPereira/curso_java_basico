package curso_java_basico_aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// this - Referência atributos e métodos da própria classe
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) { // Esses são os parâmetros do construtor
		super();
		this.marca = marca; // Aqui o this deixa esplicito que estamos referenciando o atributo da classe
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	
	public Carro() {}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parâmetros");
	}


	public Carro(String marca, String modelo) {
		this(marca, modelo, 10); // Esse this ta chamando o construtor com 3 parâmetros
		System.out.println("Chamando construtor com 2 parâmetros");
	}
	
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
