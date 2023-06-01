package exercicios_aulas34;

public class ex001 {
	
	static void exibirContador() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {

		exibirContador();
		
		Contador.incrementarContador();
		
		exibirContador();
		
		Contador.zerarContador();
		
		exibirContador();
		
		Contador.incrementarContador();
		Contador.incrementarContador();
		
		exibirContador();	
		
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		
		exibirContador();
	}
}
