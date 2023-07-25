package curso_java_basico_aula43.labs;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	protected double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
				return false;
			}
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	@Override
	public String toString() {
		String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta; 
        s += "; saldo: " + saldo;
        s += "]" ;
        return s; 
	}
}
