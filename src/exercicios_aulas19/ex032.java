package exercicios_aulas19;
import java.util.Scanner;
public class ex032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int [10];
		boolean primo;
		String msg;
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entre com um número para o Array1:");
			Array1[i] = scan.nextInt();
		}
		
		System.out.println("Array1:");
		for (int i = 0; i < Array1.length; i++) {
			primo = true;
			for (int j = 2; j < Array1[i]; j++) {
				if(Array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			msg = "";
			if (primo) {
				msg = " É um número primo!";
			} else {
				msg = " Não é um número primo!";
			}
			System.out.println(Array1[i] + msg);
		}	
	}
}
