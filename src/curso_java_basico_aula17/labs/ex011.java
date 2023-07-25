package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Vamos imprimir todos os números no intervalo de um a outro por você digitado:");
		System.out.println("Digite o primeiro número(início):");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo número(fim):");
		int n2 = scan.nextInt();
		
		int intervalo = n1;
		for (;intervalo <= n2; intervalo++) {
			System.out.println(intervalo);
			soma += intervalo;
		}
		System.out.println("A soma do intervalo entre os números " + n1 + " e " + n2 + " é = " + soma + ".");
	}
}
