package exercicios_aulas28_33;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		
		lampada.setModelo("A60");
		lampada.setTensao("Bivolt");
		lampada.setPotencia(7);
		lampada.setCor("Branca");
		lampada.setTipoLuz("Fria");
		lampada.setGarantiaMeses(6);
		
		System.out.println("Deseja ligar a lampada? [S/N]");
		String opcao = scan.next();
		
		if (opcao.equals("S") || opcao.equals("s")) {
			 boolean ligar = lampada.ligarLampada();
			 lampada.exibirFichaTecnica();
			 System.out.println("A lampada esta ligada! | condição: " + ligar);
		} else if (opcao.equals("N") || opcao.equals("n")) {
			boolean ligar = lampada.desligarLampada();
			lampada.exibirFichaTecnica();
			System.out.println("A lampada não esta ligada! | condição: " + ligar);
		} else {
			System.out.println("Informação inválida por favor tente novamente!");
		}
	}
}
