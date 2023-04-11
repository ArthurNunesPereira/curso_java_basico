package exercicios_aulas14_15;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		
		if (n1 > 0) {
			System.out.println("O numero " + n1 + " é positivo.");
		} else {
			System.out.println("O numero " + n1 + " é negativo.");
		}
	}

}
