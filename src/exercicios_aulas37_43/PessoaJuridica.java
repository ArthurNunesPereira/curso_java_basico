package exercicios_aulas37_43;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}
	
	public double calcularImposto() {
		return 0;
	}
}
