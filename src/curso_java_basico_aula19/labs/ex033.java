package curso_java_basico_aula19.labs;

import java.util.Scanner;

public class ex033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int[10];
        
        for (int i=0; i<Array1.length; i++){
            System.out.println("Entre com o valor da posição A - " + i);
            Array1[i] = scan.nextInt();
        }
        
        for (int i=0; i<Array1.length; i++){
            System.out.println("Analizando o número " + Array1[i]);
            
            for (int j=2; j<Array1[i]; j++){
                if (j % 2 == 0){
                    System.out.println(j + " é par");
                }
            }
            System.out.println();
        }
	}
}
