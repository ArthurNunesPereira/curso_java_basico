package exercicios_aulas19;
import java.util.Scanner;
public class ex017 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int[10];
		int maior35 = 0;
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com a idade: " + i);
			Array1[i] = scan.nextInt();
			
				if (Array1[i] > 35) {
					maior35 ++;
				}
		}
		System.out.println("A quantidade de pessoas com idade maior de 35 anos é: " + maior35 + ".");
	}
}
