package curso_java_basico_aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		
		System.out.println("Digite o tamanho do arquivo que quer baixar em \"MB\":");
		double tArquivo = scan.nextDouble();
		System.out.println("Agora nos informe a velocidade da sua internet em \"Mbps\":");
		double velNet = scan.nextDouble();
		double tDownload = tArquivo / velNet;
		
		System.out.println("Vão demorar " + formatador.format(tDownload) + " minutos para terminar o download desse arquivo!");
	}

}
