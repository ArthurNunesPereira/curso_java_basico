package curso_java_basico_aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno{

	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) { 
		//super(nome, endereco, telefone);
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
		//super.setCpf("48465464646"); // Usando o Super para extender o set cpf - podemos fazer graças a herança
		
		//this.setCpf("654654654446"); // Usando o this pois a classe Aluno herda o atributo da classe Pessoa 
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		//s += super.getEndereco();
		
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

	// Feito pela IDE
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	/* Feito de forma manual
	   public String toString() { 
		String s = curso + "\n";
			for(double nota : notas) {
				s += nota + " ";
			}
			
			return s;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (curso.equalsIgnoreCase(other.getCurso())) { // if feito manualmente, aqui podemos fazer o teste que quisermos para a Classe "equals" fazer a checagem para a gente
			return true;
		}
		return false;
	}
}
