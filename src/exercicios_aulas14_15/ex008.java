package exercicios_aulas14_15;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do primeiro item:");
		double item1 = scan.nextDouble();
		System.out.println("Entre com o preço do segundo item:");
		double item2 = scan.nextDouble();
		System.out.println("Entre com o preço do terceiro item:");
		double item3 = scan.nextDouble();
		
		
		if(item1 < item2) {
			System.out.println("O item mais barato é o que você deve comprar, é o item: " + item1);
			} else if (item2 < item3) {
				System.out.println("O item mais barato é o que você deve comprar, é o item: " + item2);
			} else {
				System.out.println("O item mais barato é o que você deve comprar, é o item: " + item3);
		}
	}

}
