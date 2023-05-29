package exercicios_aulas34;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.setNome(scan.next());
		
		System.out.println("Digite a matricula do aluno:");
		aluno.setMatricula(scan.nextInt());
		
		System.out.println("Digite o curso do aluno:");
		aluno.setCurso(scan.next());
		
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println("Digite o nome da disciplina: ");
			aluno.setDisciplinasPos(i, scan.next());
		}
		
		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.getDisciplinas()[i]);
			for (int j =0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Digite a nota " + (j + 1));
				aluno.setNotasPosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarinfo();
		
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.print("Disciplina " + aluno.getDisciplinas()[i]);
			if (aluno.verificarAprovado(i) == true) {
				System.out.println(" aluno aprovado!");
			} else {
				System.out.println(" aluno reprovado!");
			}
		}
	}
}
