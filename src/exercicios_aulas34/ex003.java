package exercicios_aulas34;

public class ex003 {

	static void calcularFatorial() {
		Calculadora.setNum1(5);
		int fat = 1;
		
		for(int i = Calculadora.getNum1(); i > 0 ; i--) {
			fat *= i;
		}
		System.out.println(Calculadora.getNum1() + "! = " + fat);
	}
	
	public static void main(String[] args) {
		
		calcularFatorial();
	}
}
