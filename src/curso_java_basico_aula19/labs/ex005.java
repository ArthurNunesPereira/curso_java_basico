package curso_java_basico_aula19.labs;

import java.util.Scanner;
import java.text.DecimalFormat;
public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int Array2 [] = new int[Array1.length]; // Posso fazer dessa forma tbm!
	
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			Array2[i] = Array1[i] * i;
		}
		
		
		for (int j = 0; j <= Array1.length; j++) {
			 System.out.print("Os valores do Array1 são posição: " + j + " valor: " + Array1[j] + " / ");
			 System.out.println("Os valores do Array2 valem o Array1 multiplicado por sua posição(Array1[i] * i), posição: " + j + " valor: " + Array2[j]);
		 }
	}
}

