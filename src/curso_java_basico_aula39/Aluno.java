package curso_java_basico_aula39;

public class Aluno extends Pessoa{

	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		// https://usemynotes.com/wp-content/uploads/2021/02/what-are-access-specifiers-in-java.jpg
	}
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) { 
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		//Os dois "sets" vão funcionar da mesma forma, fica a critério do desenvolvedor usar o "super.", ou o "this."
		super.setCpf("48465464646");
		
		this.setCpf("654654654446"); 
	}
}
