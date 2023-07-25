package curso_java_basico_aula19.labs;

import java.util.Scanner;
import java.text.DecimalFormat;
public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[15];
		double Array2 [] = new double[15];
	
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			Array2[i] = Math.sqrt(Array1[i]);
//Para usar o Math.sqrt (que é um método matematico para retornar raiz quadrada) o vetor precisa ser um double, então nesse caso o Array2 vai ser um double.
		}
		
		
		for (int j = 0; j <= Array1.length; j++) {
			 System.out.print("Os valores do Array1 são posição: " + j + " valor: " + Array1[j] + " / ");
			 System.out.println("Os valores do Array2 valem o Array1 ao quadrado, posição: " + j + " valor: " + formatador.format(Array2[j]));
		 }
	}
}
