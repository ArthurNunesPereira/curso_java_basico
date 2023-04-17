package curso_java_basico_aula29;


public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println();
		
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		
		Carro2 carro2 = new Carro2(); 
	}
}
