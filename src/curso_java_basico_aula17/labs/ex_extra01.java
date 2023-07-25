package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex_extra01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos números você quer analisar:");
		int qtdNum = scan.nextInt();
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i <  qtdNum; i++) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
	}
}
