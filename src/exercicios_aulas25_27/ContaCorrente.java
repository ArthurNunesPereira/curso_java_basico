package exercicios_aulas25_27;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean contaEspecial;
	double limiteEspecial;
	double valorEspecialUsado;
	int numConta;
	double saldo;

	// Saque
	boolean realizarSaque(double quantiaASacar) {

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

	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
