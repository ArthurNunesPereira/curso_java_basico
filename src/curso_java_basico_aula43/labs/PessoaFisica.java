package curso_java_basico_aula43.labs;

public class PessoaFisica extends Contribuinte{

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + "]";
	}
	
	public double calcularImposto() {
		return 0;
	}
}
