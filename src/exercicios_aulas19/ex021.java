package exercicios_aulas19;

import java.util.Scanner;

import java.lang.Math;

import java.text.DecimalFormat;

public class ex021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		
		int Array1 [] = new int[10];
		int zero = 0;
		int um = 0;
		int dois = 0;
		
		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = (int)Math.round(Math.random() * 2);
			
			if (Array1[i] == 0) {
				zero++;
			} else if (Array1[i] == 1){
				um++;
			} else {
				dois++;
			}
		}
		
		System.out.print("Array1: [");
		
		for (int j = 0; j < Array1.length; j++) {
			System.out.print(Array1[j] + " ");
		}
		System.out.println("].");
		
		double porcZero = (zero * 100)/Array1.length;
        double porcUm = (um * 100)/Array1.length;
        double porcDois = (dois * 100)/Array1.length;
        
		System.out.println("A porcentagem de valores zero do Array1 é de: " + formatador.format(porcZero) + "%.");
		System.out.println("A porcentagem de valores um do Array1 é de: " + formatador.format(porcUm) + "%.");
		System.out.println("A porcentagem de valores dois do Array1 é de: " + formatador.format(porcDois) + "%.");
	}
}