package exercicios_aulas14_15;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite o seu salario:");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			double nvsalario = salario + salario * 0.2;
			double aumento = nvsalario - salario;
		System.out.println("Seu salário antes do reajuste era: " + formatador.format(salario));
		System.out.println("Seu salário foi reajustado em 20% de aumento.");
		System.out.println("O valor aumentado foi: " + aumento);
		System.out.println("O seu novo salario é: " + formatador.format(nvsalario));
		} else if (salario >= 280 && salario < 700) {
			double nvsalario = salario + salario * 0.15;
			double aumento = nvsalario - salario;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salario));
			System.out.println("Seu salário foi reajustado em 15% de aumento.");
			System.out.println("O valor aumentado foi: " + aumento);
			System.out.println("O seu novo salario é: " + formatador.format(nvsalario));
		} else if (salario >= 700 && salario < 1500) {
			double nvsalario = salario + salario * 0.1;
			double aumento = nvsalario - salario;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salario));
			System.out.println("Seu salário foi reajustado em 10% de aumento.");
			System.out.println("O valor aumentado foi: " + aumento);
			System.out.println("O seu novo salario é: " + formatador.format(nvsalario));
		} else if (salario > 1500) {
			double nvsalario = salario + salario * 0.05;
			double aumento = nvsalario - salario;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salario));
			System.out.println("Seu salário foi reajustado em 5% de aumento.");
			System.out.println("O valor aumentado foi: " + aumento);
			System.out.println("O seu novo salario é: " + formatador.format(nvsalario));
		}
	}

}
