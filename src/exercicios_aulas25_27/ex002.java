package exercicios_aulas25_27;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		ContaCorrente contaCorrente = new ContaCorrente();

		contaCorrente.numConta = 99;
		contaCorrente.saldo = 2850;
		contaCorrente.contaEspecial = true;
		contaCorrente.limite = 1500;

		double saque;
		double deposito;

		System.out.println("Detalhes da conta:");
		System.out.println("ID da conta: " + contaCorrente.numConta);
		System.out.println("Saldo da conta: R$" + formatador.format(contaCorrente.saldo));
		System.out.println("Limite de saque da conta: R$" + formatador.format(contaCorrente.limite));

		System.out.println("Digite a quantidade de dinheiro que deseja sacar:");
		saque = scan.nextDouble();
		
		System.out.println("Seu novo saldo é = R$" + formatador.format(contaCorrente.sacarDinheiro(saque, contaCorrente.limite)));

		System.out.println("Saldo: R$" + formatador.format(contaCorrente.consultarSaldo()));
		
		System.out.println("Digite a quantidade de dinheiro que deseja depositar:");
		deposito = scan.nextDouble();
		
		System.out.println("Seu novo saldo é = R$" + formatador.format(contaCorrente.depositarDinheiro(deposito)));
		
		System.out.println("Saldo: R$" + formatador.format(contaCorrente.consultarSaldo()));

		System.out.println("Verificando se sua conta é especial: ");
		if (contaCorrente.verificarContaEspecial()) {
			System.out.println("Sua conta é especial!");
		} else {
			System.out.println("Sua conta não é especial!");
		}
	}
}

/*
 * if (contaCorrente.sacarDinheiro(saque, contaCorrente.limite) == 0) {
			System.out.println("Saque indisponivel.");
		} else {
			System.out.println("Seu novo saldo é = R$" + formatador.format(contaCorrente.sacarDinheiro(saque, contaCorrente.limite)));
		}
 * */
 