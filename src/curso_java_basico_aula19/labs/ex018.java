package curso_java_basico_aula19.labs;
import java.util.Scanner;
public class ex018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com a idade: " + i);
			Array1[i] = scan.nextInt();
			
				if (Array1[i] > maior) {
					maior = Array1[i];
				}
				
				if (Array1[i] < menor && Array1[i] != 0) {
					menor = Array1[i];
				}
		}
		System.out.println("A maior idade do Array1 é: " + maior + ".");
		System.out.println("A menor idade do Array1 é: " + menor + ".");
	}
}
