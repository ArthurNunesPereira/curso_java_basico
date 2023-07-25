package curso_java_basico_aula19.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int Array1 [] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			Array1[i] = scan.nextInt();
			soma += Array1[i];
			
		}
		System.out.println("A quantidade de valores pares no Array1 é de: " + soma);
	}
}
