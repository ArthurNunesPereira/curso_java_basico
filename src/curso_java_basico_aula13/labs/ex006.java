package curso_java_basico_aula13.labs;

import java.util.Scanner;

import java.lang.Math;

import java.text.DecimalFormat;

public class ex006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Digite o raio do circulo que quer saber a área:");
		int raio = scan.nextInt();
		int elevado = 2;
		double area = Math.PI * raio * raio;
		
		System.out.println("A área do circulo é: π * r². Neste exemplo: π * " + raio + " ^ " + elevado + " = " + formatador.format(area));
	}
}
