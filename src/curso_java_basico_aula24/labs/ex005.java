package curso_java_basico_aula24.labs;

import java.text.DecimalFormat;

public class ex005 {

	public static void main(String[] args) {
		
			DecimalFormat formatador = new DecimalFormat(".00");
			
			ContaCorrente contaCorrente = new ContaCorrente();
			
			contaCorrente.banco = "Nubank";
			contaCorrente.titular = "Arthur";
			contaCorrente.numConta = 123456;
			contaCorrente.saldo = 1500.62;
			contaCorrente.contaEspecial = true;
			contaCorrente.limite = 4500;
			
			
			System.out.println("Banco: " + contaCorrente.banco);
			System.out.println("Titular da conta: " + contaCorrente.titular);
			System.out.println("Numero da conta: " + contaCorrente.numConta);
			System.out.println("Saldo da conta: R$" + formatador.format(contaCorrente.saldo));
			
			if (contaCorrente.contaEspecial == false) {
				System.out.println("A conta não é especial.");
			} else {
				System.out.println("A conta é especial.");
			}
			System.out.println("Limite da conta: R$" + contaCorrente.limite);
	}
}
