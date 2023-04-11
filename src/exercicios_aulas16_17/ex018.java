package exercicios_aulas16_17;
import java.util.Scanner;
public class ex018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número você quer analisar:");
		int num = scan.nextInt();
		boolean primo = true;
		
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				primo = false;
				System.out.println("Não é um número primo - Divisivel por " + i);
			}
		}
		if(primo) {
			System.out.println("É um número primo!");
		}
	}
}
