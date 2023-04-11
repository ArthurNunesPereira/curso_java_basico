package exercicios_aulas16_17;
import java.util.Scanner;
public class ex020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Digite quantas pessoas tem na classe:");
		int qtdPessoas = scan.nextInt();
		int num;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Digite sua idade:");
			num = scan.nextInt();
			soma += num;
			media = soma / qtdPessoas;	
		}
		System.out.println("A classe possui " + qtdPessoas + " pessoas.");
		if (media > 0 && media <= 18) {
			System.out.println("O média de idade foi: " + media + " essa é uma turma jovem!");
		} else if (media > 18 && media < 60) {
			System.out.println("O média de idade foi: " + media + " essa é uma turma adulta!");
		} else {
			System.out.println("O média de idade foi: " + media + " essa é uma turma idosa!");
		}
	}
}
