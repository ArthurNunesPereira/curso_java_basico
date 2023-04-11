package exercicios_aulas25_27;

import java.text.DecimalFormat;

public class ex003 {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Kleber";
		aluno.matricula = 9999;
		aluno.curso = "Analise e desenvolvimento de sistemas";
		aluno.disciplinas = new String[3];
		aluno.disciplinas[0] = "Lógica";
		aluno.disciplinas[1] = "POO";
		aluno.disciplinas[2] = "Engenharia de Software II";
		
		aluno.notas = new String[3];
		aluno.notas[0] = "9";
		aluno.notas[1] = "8";
		aluno.notas[2] = "7";
		
		System.out.println("Titulo do livro: " + aluno.nome);
		System.out.println("Autor do livro: " + aluno.matricula);
		System.out.println("Número de páginas: " + aluno.curso);
		
		// for disciplinas
		System.out.println("Genero do livro: " + aluno.disciplinas);
		
		//for notas
		System.out.println("Editora: " + aluno.notas);
	}
}
