package curso_java_basico_aula27;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		// Chamando o metodo diretamente
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());

		double autonomia = van.obterAutonomia(); // Atribuindo o metodo a uma variavel
		System.out.println("A autonomia do carro é: " + autonomia);
		
		double qtdCombustivel1 = van.calcularCombustivel(10); // 10 é o argumento referente a variavel km do metodo calcularCombustivel()
		double qtdCombustivel2 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel1 = " + qtdCombustivel1);
		System.out.println("qtdCombustivel2 = " + qtdCombustivel2);
	}

}
