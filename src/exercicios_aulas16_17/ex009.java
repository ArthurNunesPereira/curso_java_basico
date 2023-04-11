package exercicios_aulas16_17;
import java.util.Scanner;
public class ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Vamos imprimir todos os números impares entre 1 - 50:");
		
		for (int i = 1; i < 50; i++) {
		
			if (i % 2 != 0) {
				System.out.println(i);
			}	
		}
	}
}
