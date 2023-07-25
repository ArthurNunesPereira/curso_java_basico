package curso_java_basico_aula13.labs;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora trabalhada:");
		double hrValor = scan.nextDouble();
		System.out.println("Quantas horas você trabalha por mês?");
		double hrTrabalhadas = scan.nextDouble();
		double salario = hrValor * hrTrabalhadas;
		
		System.out.println("Seu salário é: " + salario);
	}

}
