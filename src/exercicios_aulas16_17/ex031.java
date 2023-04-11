package exercicios_aulas16_17;

import java.util.Scanner;
import java.text.DecimalFormat;
public class ex031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double porcentagem = 1.5;
		System.out.println("Digite o seu salario:");
		double salario = scan.nextDouble();
		
		for (int ano = 2018; ano <= 2022; ano++) {
			
			double nvsalario = salario + (salario/100) * porcentagem;
			double aumento = nvsalario - salario;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salario));
			System.out.println("Seu salário foi reajustado em " + porcentagem + "% de aumento.");
			System.out.println("O valor aumentado foi: " + formatador.format(aumento));
			System.out.println("O seu novo salario é: " + formatador.format(nvsalario));
			salario = nvsalario;
			porcentagem = porcentagem * 2;
		}
	}
}
