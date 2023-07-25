package curso_java_basico_aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double caixa = 0;		
		double troco = 0;
		double pagCliente = 0;
		int i = 1;
		boolean fimCaixa = false;
		
		while (!fimCaixa) {
			System.out.println("Digite o valor do produto:");
			double valor = scan.nextDouble();
			System.out.println("Produto " + i + " - R$: " + formatador.format(valor));
			caixa += valor;
			troco = caixa - pagCliente;
			i++;
			if (valor == 0) {
				fimCaixa = true;
				System.out.println("Você comprou " + i + " produtos no valor total de: R$" + formatador.format(caixa));
				System.out.println("Digite o valor do pagamento:");
				pagCliente = scan.nextDouble();
				troco = caixa - pagCliente;
				System.out.println("Seu troco é de: R$" + formatador.format(troco));
				
				System.out.println("Deseja continuar a comprar? [s/n]:");
				String continuarCompra = scan.next();
			
				if (continuarCompra.equals("s") ||  continuarCompra.equals("S")) {
					fimCaixa = false;
				} else {
					System.out.println("Fim da compra, volte sempre!");
				}
			}
		}
	}
}