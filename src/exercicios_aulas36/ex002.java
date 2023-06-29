package exercicios_aulas36;

import java.util.Scanner;

public class ex002 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		Professor professor = new Professor();
		
		System.out.println("Digite o nome do curso:");
		curso.setNome(scan.nextLine());
		
		System.out.println("Digite o horário do curso:");
		curso.setHorario(scan.nextLine());
		
		System.out.println("Digite o nome do professor do curso:");
		professor.setNome(scan.nextLine());
		
		System.out.println("Digite o departamento do professor:");
		professor.setDepartamento(scan.nextLine());
		
		System.out.println("Digite o email do professor:");
		professor.setEmail(scan.nextLine());
		
		Aluno[] alunos = new Aluno[5];
		System.out.println("Entre com os alunos do curso " + curso.getNome());
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do aluno nº" + i + " :");
			String nomeAluno = scan.nextLine();
			
			System.out.println("Digite a matricula do aluno nº" + i + " :");
			String matAluno = scan.nextLine();
			
			double[] notas = new double[4];
			for (int j = 0; j < 4; j++) {
				System.out.println("Digite as notas do aluno nº" + i + " :");
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
	}
}

 