package curso_java_basico_aula35.labs;

public class SomatorioN {
	
	public static int somatorioNum(int num) {

		if(num == 1) {
			return 1;
		}
		
		return num + somatorioNum(num - 1);
	}
}
