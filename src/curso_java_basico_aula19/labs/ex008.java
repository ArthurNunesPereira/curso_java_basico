package curso_java_basico_aula19.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int Array2 [] = new int[Array1.length]; // Posso fazer dessa forma tbm!
		int Array3 [] = new int[Array1.length];
	
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Array1 - Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			System.out.println("Array2 - Digite o valor da posição: " + i);
			Array2[i] = scan.nextInt();
			
			Array3[i] = Array1[i] * Array2[i];
		}
		
		
		for (int j = 0; j <= Array1.length; j++) {
			 System.out.print("Os valores do Array1 são posição: " + j + " valor: " + Array1[j] + " / ");
			 System.out.println("Os valores do Array2 são posição: " + j + " valor: " + Array2[j] + " / ");
			 System.out.println("Os valores do Array3 valem o Array1 multiplicado pelo Array2, posição: " + j + " valor: " + Array3[j]);
		}
	}
}
