package exercicios_aulas28_33;

public class Aluno {
	
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double [][] notas = new double[3][4];
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return this.notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void mostrarinfo() {
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
	
	public boolean verificarAprovado (int indice) {
		
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
