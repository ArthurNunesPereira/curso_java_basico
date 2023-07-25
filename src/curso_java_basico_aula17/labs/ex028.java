package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex028 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número para saber se ele é primo ou não:");
		int num = scan.nextInt();
		String primo = "";
		
		for(int i = 3; i < num ; i++) {
			if (num % 2 !=0 && num % i != 0) {
				primo = "É primo!";
			} else {
				primo = "Não é primo";
			}
		}
		System.out.println(primo);
	}
}
