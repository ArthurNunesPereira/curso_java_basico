package curso_java_basico_aula31;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.marca = "Fiat";
		carro.consumoCombustivel = 0.2; // Não tem acesso ao atributo consumoCombustivel pois ele está como privado, e só pode ser acessado pela própria classe
		
	}

}
