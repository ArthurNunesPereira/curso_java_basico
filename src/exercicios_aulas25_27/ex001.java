package exercicios_aulas25_27;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Quente";
		lampada.garantiaMeses = 12;
		
		boolean statusLampada;
		System.out.println("Lampada " + lampada.modelo + ".");
		
		System.out.println("Deseja ligar a lampada? [S/N]");
		String opcao = scan.next();
		
		if (opcao.equals("S")) {
			 boolean ligar = lampada.ligarLampada();
			 System.out.println("A lampada esta ligada! | condição: " + ligar);
		} else if (opcao.equals("N")) {
			boolean ligar = lampada.desligarLampada();
			System.out.println("A lampada não esta ligada! | condição: " + ligar);
		} else {
			System.out.println("Informação inválida por favor tente novamente!");
		}
	}
}
