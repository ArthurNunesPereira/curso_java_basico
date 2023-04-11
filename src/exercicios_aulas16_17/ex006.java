package exercicios_aulas16_17;

import java.util.Scanner;

import java.lang.Math;

import java.text.DecimalFormat;

public class ex006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 - 20 um embaixo do outro:");
		int i = 0;
		
		for (i = 0; i <= 20 ;i++) {
			System.out.println(i);
		}
		
		System.out.println("1 - 20 um do lado do outro:");
		int j = 0;
		for (j = 0; j <= 20 ; j++) {
			System.out.print(j + " ");
		}
	}
}