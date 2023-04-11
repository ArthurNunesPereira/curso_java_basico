package curso_java_basico_aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		System.out.println("Carro01:");
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumocombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		System.out.println();
		
		System.out.println("Carro02:");
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumocombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
