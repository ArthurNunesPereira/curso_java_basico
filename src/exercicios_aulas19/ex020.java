package exercicios_aulas19;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double Array1[] = new double[20];
		double cotação;
		
		System.out.println("Entre com a cotação do dolar: ");
		cotação = scan.nextDouble();
		
		for(int i = 0; i < Array1.length; i++) {
			Array1[i] = cotação * (i+1);
		}
		
		for (int j  = 0; j < Array1.length; j++) {
			System.out.println("Cotação do dolar: " + formatador.format(Array1[j]));
		}
	}
}
