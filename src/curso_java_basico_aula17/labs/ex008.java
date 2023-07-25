package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			soma += num;
			media = soma / 5;	
		}
		System.out.println("O soma dos números foi: " + soma);
		System.out.println("O média dos números foi: " + media);
	}
}
