package exercicios_aulas16_17;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int paisA = 0;
		int paisB = 0;
		int cont = 0;
		for (paisA = 80000, paisB = 200000; paisA < paisB ; paisA += paisA * 0.03, paisB += paisB * 0.015) {
			System.out.println("A população no país A é de = " + paisA + "; A população no país B é de = " + paisB);
			cont++;
		}
		System.out.println("A população no país A é de = " + paisA + "; A população no país B é de = " + paisB + ". Se passaram " + cont + " anos.");
	}

}
