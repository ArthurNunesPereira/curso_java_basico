package curso_java_basico_aula34.labs;

public class Calculadora {

	private static int num1;
	private static int num2;
	
	public static int getNum1() {
		return num1;
	}

	public static void setNum1(int num1) {
		Calculadora.num1 = num1;
	}

	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		Calculadora.num2 = num2;
	}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static void calcularFatorial() {
		Calculadora.setNum1(5);
		int fat = 1;
		
		for(int i = Calculadora.getNum1(); i > 0 ; i--) {
			fat *= i;
		}
		System.out.println(Calculadora.getNum1() + "! = " + fat);
	}
}
