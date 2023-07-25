package curso_java_basico_aula35.labs;

public class Fibonacci {
	
	private static int num;
	
	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Fibonacci.num = num;
	}
	
	public static int gerarFibo(int num) {
		
		if (num < 2) {
			return 1;
		}
		return gerarFibo(num-1) + gerarFibo(num-2);
	}
}
