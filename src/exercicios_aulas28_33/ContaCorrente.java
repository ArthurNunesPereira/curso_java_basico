package exercicios_aulas28_33;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private boolean contaEspecial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private int numConta;
	private double saldo;
	
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isContaEspecial() {
		return this.contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public double getLimiteEspecial() {
		return this.limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return this.valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean realizarSaque(double quantiaASacar) {

		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			if (contaEspecial) {
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
