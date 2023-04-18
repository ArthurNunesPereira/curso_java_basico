package curso_java_basico_aula31Alt;

import curso_java_basico_aula31.Carro;

public class TesteCarroAlt {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat"; // Visivel pois o atributo da Classe Carro do pacote 31 está como public
		carro.modelo = "Ducato"; // Não está visivel pois o atributo da Classe Carro do pacote 31 está como default, e não pode ser acessada por outro pacote
	}

}
