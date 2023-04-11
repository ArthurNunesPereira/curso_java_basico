package exercicios_aulas19;
import java.util.Scanner;
public class ex034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Array1[] = new int[10];
        
        for (int i=0; i<Array1.length; i++){
            System.out.println("Entre com o valor da posição A - " + i);
            Array1[i] = scan.nextInt();
        }
        
        for (int i=0; i<Array1.length; i++){
            System.out.println("Analizando o número " + Array1[i]);
            
            for (int j=1; j<Array1[i]; j++){
                if (Array1[i] % j == 0){
                    System.out.println(j + " é divisor");
                }
            }
            System.out.println();
        }
	}
}
