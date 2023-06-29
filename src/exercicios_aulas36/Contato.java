package exercicios_aulas36;

public class Contato {

	private String nome;
	private Telefone[] telefones;
	private Email[] emails;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	public Email[] getEmails() {
		return emails;
	}
	
	public void setEmails(Email[] emails) {
		this.emails = emails;
	}
}
