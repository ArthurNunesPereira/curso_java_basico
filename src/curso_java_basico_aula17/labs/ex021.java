package curso_java_basico_aula17.labs;

import java.util.Scanner;

import java.lang.Math;

import java.text.DecimalFormat;

public class ex021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas turmas tem na escola:");
		int qtdTurmas = scan.nextInt();
		int qtdPessoas = 0;
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < qtdTurmas; i++) {
			System.out.println("Digite quantos alunos tem na classe:");
			qtdPessoas = scan.nextInt();
			
			if (qtdPessoas < 40) {
				soma += qtdPessoas;
				media = soma / qtdTurmas;
			} else {
				i--;
				System.out.println("A turma não pode ter mais que 40 alunos, por favor tente de novo!");
			}
		}
		System.out.println("O média de alunos foi: " + media);
	}
}