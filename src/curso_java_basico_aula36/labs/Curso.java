package curso_java_basico_aula36.labs;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public Curso() {
	}

	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		super();
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "Nome do curso = " + nome + "\n";
		info += "Horário do curso = " + horario + "\n";

		if (professor != null) {
			info += professor.obterInfo();
		}

		info += "---Alunos---" + "\n";
		if (alunos != null) {
			for (Aluno aluno : alunos) {
				if (aluno != null) {
					info += aluno.obterInfo();
					info += "\n";
				}
			}
			info += "\nMédia da turma = " + obterMediaTurma();
		}
		return info;
	}
	
	public double obterMediaTurma() {
		double soma = 0;
		
		for (Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma / alunos.length;
	}
}
