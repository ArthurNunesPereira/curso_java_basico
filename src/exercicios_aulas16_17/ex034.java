package exercicios_aulas16_17;
import java.util.Scanner;
public class ex034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Digite o valor de n:");
        int n = scan.nextInt();
        
        for (int i=1; i <= n; i++){
        soma += 1/i;
        }
        System.out.println("\nA soma da sequência é: " + soma);
	}
}
