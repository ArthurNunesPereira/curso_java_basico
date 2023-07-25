package curso_java_basico_aula36.labs;

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
	
	public String obterInfo() {
		String info = "Nome da agenda = " + nomeAgenda + "\n";
		
		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
}
