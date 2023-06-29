package exercicios_aulas36;

import java.util.Scanner;

import curso_java_basico_aula36.Telefone;

public class ex001 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda:");
		String nomeAgenda = scan.nextLine();
		
		Agenda agenda = new Agenda(nomeAgenda);
		
	}
}
