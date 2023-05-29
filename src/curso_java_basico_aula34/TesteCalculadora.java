package curso_java_basico_aula34;

public class TesteCalculadora {

	static double somaTotal; // Variavel estatica criada fora do método Main podendo ser utilizada dentro dele. O mesmo vale para métodos.
	
	public static void main(String[] args) {
		
		//MinhaCalculadora calculadora = new MinhaCalculadora(); Não precisa instanciar a classe por os métodos dela são estaticos então é só chamar a classe direto!
		
		int soma1 = MinhaCalculadora.soma(1, 2);
		
		System.out.println(soma1);
		
		int soma2 = MinhaCalculadora.soma(1, 2, 3);
				
		System.out.println(soma2); 
		
		double num1 = 1.4;
		double num2 = 2.7;
		
		double soma3 = MinhaCalculadora.soma(num1, num2);
		
		System.out.println(soma3);
		
		somaTotal = soma1 + soma2 + soma3;
		
		System.out.println(somaTotal);
	}

}
