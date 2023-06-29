package exercicios_aulas36;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public Agenda() {
	}
	
	public Agenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}
	
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}	
}
