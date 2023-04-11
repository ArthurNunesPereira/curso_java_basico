package exercicios_aulas11_13;
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
