package exercicios_aulas11_13;
import java.util.Scanner;
public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = scan.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma de " + n1 + " e " + n2 + " é: " + soma);

	}

}
