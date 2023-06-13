package exercicios_aulas35;

public class SomatorioN {
	
	public static int somatorioNum(int num) {

		if(num == 1) {
			return 1;
		}
		
		return num + somatorioNum(num - 1);
	}
}
