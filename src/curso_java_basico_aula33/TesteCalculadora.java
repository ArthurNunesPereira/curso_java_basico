package curso_java_basico_aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		int soma1 = calculadora.soma(1, 2);
		
		System.out.println(soma1);
		
		int soma2 = calculadora.soma(1, 2, 3);
				
		System.out.println(soma2); 
		
		double num1 = 1.4;
		double num2 = 2.7;
		
		double soma3 = calculadora.soma(num1, num2);
		
		System.out.println(soma3);
	}

}
