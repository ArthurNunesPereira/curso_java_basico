package curso_java_basico_aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 0;
		int c = 0;
		
		System.out.println("Contando até 10 usando o While");
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Contando até 10 usando o Do While");
		do { 
			System.out.println(c);
			c++;
		} while (c <= 10);
	}

}
