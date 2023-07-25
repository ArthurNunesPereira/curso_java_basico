package curso_java_basico_aula19.labs;
import java.util.Scanner;
public class ex028 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int [10];
		int Array2[] = new int [10];
		int Array3[] = new int [20];
		
		for (int i = 0; i < Array1.length; i++) {
				System.out.println("Entre com o número para o Array1:");
				Array1[i] = scan.nextInt();
				Array3[i] = Array1[i];
					
		}
		
		for (int i = 0; i < Array2.length; i++) {
			System.out.println("Entre com o número para o Array2:");
			Array2[i] = scan.nextInt();
			Array3[i + Array1.length] = Array2[i];
		}
		
		System.out.print("Array1: [");
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + " ");
		}
		System.out.println("].");
		
		System.out.print("Array2: [");
		for (int k = 0; k < Array2.length; k++) {
			System.out.print(Array2[k] + " ");
		}
		System.out.println("].");
		
		System.out.print("Array3: [");
		for (int l = 0; l < Array3.length; l++) {
			System.out.print(Array3[l] + " ");
		}
		System.out.println("].");
	}
}
