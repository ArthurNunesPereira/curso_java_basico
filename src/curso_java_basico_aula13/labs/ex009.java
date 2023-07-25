package curso_java_basico_aula13.labs;
import java.util.Scanner;
public class ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit:");
		double tempF = scan.nextDouble();
		double tempC = 5 * (tempF - 32) / 9;
		
		System.out.println("A temperatura em graus Celcius é: " + tempC);
	}

}
