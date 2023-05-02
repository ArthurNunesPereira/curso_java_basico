package exercicios_aulas28_33;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		ContaCorrente contaCorrente = new ContaCorrente();

		contaCorrente.setNumero("99");
		contaCorrente.setAgencia("2850");
		contaCorrente.setContaEspecial(true);
		contaCorrente.setLimiteEspecial(500);
		contaCorrente.setSaldo(-10);
		contaCorrente.setValorEspecialUsado(0);

		boolean saqueEfetuado = contaCorrente.realizarSaque(500);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			contaCorrente.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar o saque, saldo insuficiente!");
		}
		
		System.out.println("Depósito de 500 reais");
		contaCorrente.depositar(500);
		contaCorrente.consultarSaldo();

		if (contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		contaCorrente.consultarSaldo();
		if (contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}
}

 