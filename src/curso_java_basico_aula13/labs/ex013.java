package curso_java_basico_aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite quanto você ganha por hora trabalhada:");
		double hrValor = scan.nextDouble();
		System.out.println("Quantas horas você trabalha por mês?");
		double hrTrabalhadas = scan.nextDouble();
		double salarioB = hrValor * hrTrabalhadas;
		double ir = salarioB * 0.11;
		double inss = salarioB * 0.08;
		double sindicato = salarioB * 0.05;
		double salarioL = salarioB - ir - inss - sindicato;
		System.out.println("Seu salário bruto é: " + formatador.format(salarioB));
		System.out.println("Você pagou ao imposto de renda a seguinte quantia: " + formatador.format(ir));
		System.out.println("Você pagou ao INSS a seguinte quantia: " + formatador.format(inss));
		System.out.println("Você pagou ao Sindicato a seguinte quantia: " + formatador.format(sindicato));
		System.out.println("Seu salário líquido é: " + formatador.format(salarioL));
	}
}
