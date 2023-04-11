package curso_java_basico_aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor insira um número para saber o dia da semana [1 - 7]:");
		int diaSemana = scan.nextInt();
		//Estrutura com if aninhado
		//OBS: a info a ser analisada no caso do if else, é uma expresão lógica, ou seja é um boolean
		/*if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Terça");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("Por favor insira um número valido [1 - 7]");
		}*/
		
		//No Switch case a info a ser analisada pode ser byte,short,int,char,string ou Enum. Assim aumentando as possibilidades de uso.
		switch (diaSemana) {
		case 1:  System.out.println("Domingo"); break;
		case 2:  System.out.println("Segunda"); break;
		case 3:  System.out.println("Terça"); break;
		case 4:  System.out.println("Quarta"); break;
		case 5:  System.out.println("Quinta"); break;
		case 6:  System.out.println("Sexta"); break;
		case 7:  System.out.println("Sabado"); break;
		default: System.out.println("Por favor insira um número valido [1 - 7]"); break;
		}
	} 

}
