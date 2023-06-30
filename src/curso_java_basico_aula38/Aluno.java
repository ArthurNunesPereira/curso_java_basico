package curso_java_basico_aula38;

public class Aluno extends Pessoa{

	private String curso;
	private double[] notas;
	
	public Aluno() { // Usando Construtor da SuperClasse
		super();
	}
	
	// Usando Construtor da SuperClasse com atributos, pois na SuperClasse foi gerado um construtor utilizando os campos citados abaixo.  
	//Também é possivel declarar um atributo especifico da classe filha dentro deste construtor, que nesse exemplo é o "curso" 
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
		super.setCpf("48465464646"); // Usando o Super para extender o set cpf - podemos fazer graças a herança
		
		this.setCpf("654654654446"); // Usando o this pois a classe Aluno herda o atributo da classe Pessoa 
	}
}
