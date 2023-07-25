package curso_java_basico_aula27.labs;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double [][] notas = new double[3][4];
	
	void mostrarinfo() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matricula do aluno: " + matricula);
		System.out.println("Curso do aluno: " + curso);
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	boolean verificarAprovado (int indice) {
		
		double soma = 0;
		
		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma / notas.length;
		
		if (media >= 7) {
			return true;
		}
		return false;
	}
}
