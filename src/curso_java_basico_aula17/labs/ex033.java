package curso_java_basico_aula17.labs;

import java.util.Scanner;

public class ex033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Entre com o número inicial:");
        int n1 = scan.nextInt();
        
        for (int i=1, j = 1; i <= n1; i++, j += 2){
        System.out.print(i + " / " + j + " + ");
        soma += i/j;
        }
        System.out.println("\nA soma da sequência é: " + soma);
	}
}
