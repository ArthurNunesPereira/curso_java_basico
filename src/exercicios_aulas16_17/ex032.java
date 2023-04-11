package exercicios_aulas16_17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double caixa = 0;		
		int i = 1;
		boolean fimCaixa = false;
		double valor = 0;
		String output = "";
		
		while (!fimCaixa) {
			System.out.println("Digite o codigo do produto:");
			double cod = scan.nextInt();
			System.out.println("Digite a quantidade do seu pedido:");
			double qtdPedido = scan.nextDouble();
			if (cod == 100) {
				cod = 1.20;
				output += "Cachorro Quente -> R$:1,20 * " + qtdPedido;
				output += " = " + (1.2 * qtdPedido) + "\n";
			} else if (cod == 101) {
				cod = 1.30;
				output += "Bauru Simples -> R$:1,30 * " + qtdPedido;
				output += " = " + (1.3 * qtdPedido) + "\n";
			} else if (cod == 102) {
				cod = 1.50;
				output += "Bauru com ovo -> R$:1,50 * " + qtdPedido;
				output += " = " + (1.5 * qtdPedido) + "\n";
			} else if (cod == 103) {
				cod = 1.20;
				output += "Hambúrguer -> R$:1,20 * " + qtdPedido;
				output += " = " + (1.2 * qtdPedido) + "\n";
			} else if (cod == 104) {
				cod = 1.30;
				output += "Cheeseburguer -> R$:1,30 * " + qtdPedido;
				output += " = " + (1.3 * qtdPedido) + "\n";
			} else if (cod == 105) {
				cod = 1.00;
				output += "Refrigerante -> R$:1,00 * " + qtdPedido;
				output += " = " + (1 * qtdPedido) + "\n";
			} else {
				cod = 0;
				System.out.println("Código informado inválido!");
			}
			
			valor = cod * qtdPedido;
			caixa += valor;
			i++;
			
			if (cod < 100 || cod > 105) {
				fimCaixa = true;
				
				System.out.println("Deseja continuar a comprar? [s/n]:");
				String continuarCompra = scan.next();
			
				if (continuarCompra.equals("s") ||  continuarCompra.equals("S")) {
					fimCaixa = false;
				} else {
					System.out.println("Fim da compra, volte sempre!" + "\n");
				}
			}
		}
		System.out.println("Seu pedido foi:");
		System.out.println(output);
		System.out.println("Seu pedido ficou no valor total de: R$" + formatador.format(caixa));
	}
}
