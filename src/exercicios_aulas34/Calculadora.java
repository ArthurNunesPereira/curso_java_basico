package exercicios_aulas34;

public class Calculadora {

	private static int num1;
	private static int num2;
	private static int numPotencia;
	
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

	public static int getNumPotencia() {
		return numPotencia;
	}

	public static void setNumPotencia(int numPotencia) {
		Calculadora.numPotencia = numPotencia;
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
}
