package curso_java_basico_aula41;

public abstract class Pessoa {
// Palavra reservada do Java "abstract", significa que uma classe é abstrata, ela não pode ser instanciada, somente as classes filhas dela podem ser instanciadas
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular;
	
	public Pessoa() {} // Construtor "Object"

// Construtor utilizando os campos da classe, como esta é uma SuperClasse esse construtor vai permitir as classes filhas utilizarem um construtor com os atributos desta Classe.
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		return endereco;
	}
	
	public abstract void imprimirEtiquetaEndereco(); // Metodo abstrato, é obrigatório as classes filhas declararem esses metodos!
}
