package curso_java_basico_aula17;

public class LoopFor {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		System.out.println("Contando até 10 usando o For:");
		for(i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("Contando de 10 a 0 usando o For:");
		for(i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		// For com duas variáveis.
		for (i = 0, j = 10; i < j ; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		// For com partes ausentes
		int c = 0;
		for (; c <=10 ;) {
			System.out.println("valor de c = " + c);
			c += 2; // Vai incrementar de 2 em 2 (2 passos)
		}
		
		// Loop sem corpo
		int soma = 0;
		for (int cont = 1; i <= 5; soma += i++);
		System.out.println("O valor de soma é = " + soma);
	}

}
