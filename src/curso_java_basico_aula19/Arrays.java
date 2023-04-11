package curso_java_basico_aula19;

public class Arrays {

	public static void main(String[] args) {
		
		 double temperaturas [] = new double[10];
		 temperaturas[0] = 31.5;
		 temperaturas[1] = 32.3;
		 temperaturas[2] = 34.7;
		 temperaturas[3] = 21.5;
		 temperaturas[4] = 29.6;
		 temperaturas[5] = 32.2;
		 
		 
		 System.out.println("O valor da temperatura do dia 5 é: " + temperaturas[4]);
		 System.out.println("O tamanho do Array é: " + temperaturas.length);
		 System.out.println("Valores do Array:");
		 
		 //For clássico
		 for (int i = 0; i <= temperaturas.length; i++) {
			 System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		 }
		 
		 // For "melhorado"
		 for(double temp : temperaturas) {
			 System.out.println(temp);
		 }
	}
}
