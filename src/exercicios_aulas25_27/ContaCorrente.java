package exercicios_aulas25_27;

public class ContaCorrente {

	String banco;
	String titular;
	int numConta;
	double saldo;
	boolean contaEspecial;
	int limite;

	// Saque
	double sacarDinheiro(double saque, int limite) {
		if (saldo > 0 && saque > 0 && saque < limite) {
			saldo = saldo - saque;
			return saldo;
		}
		return 0;
	}

	// Deposito
	double depositarDinheiro(double deposito) {
		saldo = saldo +  deposito;
		return saldo;
	}

	// Consultar saldo
	double consultarSaldo() {
		return saldo;
	}
	
	// Verificar conta especial
	
	boolean verificarContaEspecial() {
		if (contaEspecial) {
			return true;
		} else {
			return false;
		}
	}
}
