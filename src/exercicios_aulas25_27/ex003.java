package exercicios_aulas25_27;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.nome = scan.next();
		
		System.out.println("Digite a matricula do aluno:");
		aluno.matricula = scan.nextInt();
		
		System.out.println("Digite o curso do aluno:");
		aluno.curso = scan.next();
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina: ");
			aluno.disciplinas[i] = scan.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.disciplinas[i]);
			for (int j =0; j < aluno.notas[i].length; j++) {
				System.out.println("Digite a nota " + (j + 1));
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarinfo();
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Disciplina " + aluno.disciplinas[i]);
			if (aluno.verificarAprovado(i) == true) {
				System.out.println(" aluno aprovado!");
			} else {
				System.out.println(" aluno reprovado!");
			}
		}
	}
}
