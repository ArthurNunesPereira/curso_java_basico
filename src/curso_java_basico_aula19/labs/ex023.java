package curso_java_basico_aula19.labs;

import java.util.Scanner;
import java.text.DecimalFormat;
public class ex023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1 [] = new int [10];
		boolean palindromo = true;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com um número para o Array:");
			Array1[i] = scan.nextInt();
		}
		
        for (int i = 0; i < (Array1.length/2); i++){
            
            if (Array1[i] != Array1[Array1.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        
		System.out.print("Array1: [");
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + "");
		}
		System.out.println("].");
		
		if (palindromo){
            System.out.println("Este Array é um palíndromo.");
        } else {
            System.out.println("Este Array não é um palíndromo.");
        }
	}
}
