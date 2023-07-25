package curso_java_basico_aula19.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0");
		
		int Array1 [] = new int[15];
		int Array2 [] = new int[15];
		int fat = 1;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			for(int j = Array1[i]; j > 0 ; j--) {
				fat *= j;
			}
			Array2[i] = fat;
			fat = 1;
		}

		 System.out.print("Array1: [");
			for (int j = 0; j < Array1.length; j++) {
				System.out.print(formatador.format(Array1[j]) + " ");
			}
			System.out.println("].");
			
		System.out.print("Array2: [");
			for (int j = 0; j < Array2.length; j++) {
				System.out.print(formatador.format(Array2[j]) + " ");
			}
			System.out.println("].");
	}
}
