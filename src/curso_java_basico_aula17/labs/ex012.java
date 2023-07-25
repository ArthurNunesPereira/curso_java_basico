package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja ver a tabuada:");
		int n1 = scan.nextInt();
		
		for (int mult = 0; mult <=10; mult++) {
			int produto = n1 * mult;
			System.out.println(n1 + " X " + mult + " = " + produto);
		}
	}

}
