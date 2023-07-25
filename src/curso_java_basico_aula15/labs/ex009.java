package curso_java_basico_aula15.labs;
import java.util.Scanner;
public class ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int n3 = scan.nextInt();
		
		//Exibir os 3 numeros em ordem decrescente (do maior pro menor).
		if(n1 > n2) {
			System.out.println("A ordem de numeros do maior pro menor é: ");
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			} else if (n2 > n3) {
				System.out.println("A ordem de numeros do maior pro menor é: ");
				System.out.println(n2);
				System.out.println(n3);
				System.out.println(n1);
			} else {
				System.out.println("A ordem de numeros do maior pro menor é: ");
				System.out.println(n3);
				System.out.println(n2);
				System.out.println(n1);
		}
	}

}
