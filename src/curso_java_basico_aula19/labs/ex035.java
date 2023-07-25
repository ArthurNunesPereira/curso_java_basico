package curso_java_basico_aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0");
		
		double Array1[] = new double [11];
        
        for (int i=0; i<Array1.length; i++){
            Array1[i] = Math.pow(2, i);
        }
        
        System.out.print("Array1: [");
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(formatador.format(Array1[j]) + " ");
		}
		System.out.println("].");
	}
}
