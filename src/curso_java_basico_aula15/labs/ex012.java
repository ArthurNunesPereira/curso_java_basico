package curso_java_basico_aula15.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite quanto você ganha por hora trabalhada:");
		int hrValor = scan.nextInt();
		System.out.println("Quantas horas você trabalha por mês?");
		int hrTrabalhadas = scan.nextInt();
		int salarioB = hrValor * hrTrabalhadas;
		
		if (salarioB <= 900) {
		System.out.println("Isento de impostos!");
		System.out.println("O seu salario é: " + formatador.format(salarioB));
		} else if (salarioB >= 1500 && salarioB < 2500) {
			double desconto = salarioB * 0.05;
			double salarioL = salarioB - desconto;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salarioB));
			System.out.println("Seu salário foi reajustado em 5% de desconto.");
			System.out.println("O valor descontado foi: " + formatador.format(desconto));
			System.out.println("O seu novo salario é: " + formatador.format(salarioL));
		} else if (salarioB > 1500 && salarioB <= 2500) {
			double desconto = salarioB * 0.1;
			double salarioL = salarioB - desconto;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salarioB));
			System.out.println("Seu salário foi reajustado em 10% de desconto.");
			System.out.println("O valor descontado foi: " + formatador.format(desconto));
			System.out.println("O seu novo salario é: " + formatador.format(salarioL));
		} else if (salarioB > 2500) {
			double desconto = salarioB * 0.2;
			double salarioL = salarioB - desconto;
			System.out.println("Seu salário antes do reajuste era: " + formatador.format(salarioB));
			System.out.println("Seu salário foi reajustado em 20% de desconto.");
			System.out.println("O valor descontado foi: " + formatador.format(desconto));
			System.out.println("O seu novo salario é: " + formatador.format(salarioL));
		}
	}

}
