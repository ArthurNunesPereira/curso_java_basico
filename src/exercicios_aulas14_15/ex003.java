package exercicios_aulas14_15;
import java.util.Scanner;
public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo M-Masculino, F-Feminino:");
		String sexo = scan.next();

		if (sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Sexo Masculino");
		} else if (sexo.equals("F") || sexo.equals("f")) {
			System.out.println("Sexo Feminino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
