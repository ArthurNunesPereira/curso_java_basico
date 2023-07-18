package exercicios_aulas37_43;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex001 {

	private static void realizarSaque(ContaBancaria conta, double valor) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = R$" + formatador.format(conta.saldo));
		} else {
			System.out.println("Não foi possível realizar o saque de = R$" + formatador.format(valor)
					+ "; saldo de = R$" + formatador.format(conta.saldo));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.println(" ****  TESTE CONTA BANCÁRIA *** ");
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNomeCliente("Conta Bancária");
		contaBancaria.setNumConta("11111");

		System.out.println(contaBancaria);

		contaBancaria.depositar(500);
		System.out.println("Deposito efetuado com sucesso!");
		System.out.println(contaBancaria);

		realizarSaque(contaBancaria, 200);

		realizarSaque(contaBancaria, 500);
		System.out.println(contaBancaria + "\n");

		System.out.println(" ****  TESTE CONTA POUPANÇA *** ");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(18);

		System.out.println(contaPoupanca);

		contaPoupanca.depositar(500);
		System.out.println("Deposito efetuado com sucesso!");
		System.out.println(contaPoupanca);

		realizarSaque(contaPoupanca, 200);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = R$" + contaPoupanca.getSaldo() + "\n");
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!" + "\n");
		}

		System.out.println(" ****  TESTE CONTA ESPECIAL *** ");
		ContaEspecial contaEspecial = new ContaEspecial();

		contaEspecial.setNomeCliente("Conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(400);

		System.out.println(contaEspecial);

		contaEspecial.depositar(500);
		System.out.println("Deposito efetuado com sucesso!");
		System.out.println(contaEspecial);

		realizarSaque(contaEspecial, 200);

		realizarSaque(contaEspecial, 700);
		System.out.println(contaEspecial + "\n");
	}
}
