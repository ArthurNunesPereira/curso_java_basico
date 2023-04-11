package exercicios_aulas16_17;
import java.util.Scanner;
public class ex017 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que quer saber o fatorial:");
		int num = scan.nextInt();
		int fat = 1;
		
		for(int i = num; i > 0 ; i--) {
			fat *= i;
		}
		System.out.println(num + "! = " + fat);
	}
}
