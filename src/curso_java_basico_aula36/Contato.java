package curso_java_basico_aula36;

public class Contato { 
    	
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones; // Usando Array para fins dadáticos, mas o certo a se utilizar quando se quer trabalhar com coleções de objetos, o certo é usar "collections"
    // Collections são estruturas de dados já prontas do Java, pode ser um "set", "list", etc.... Vai depender da aplicação!
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
}
