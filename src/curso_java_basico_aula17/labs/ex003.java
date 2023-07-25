package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean idadeValido = false;
		boolean sexoValido = false;
		boolean estadoCivilValido = false;
		
		while (!idadeValido || !sexoValido || !estadoCivilValido) {
			System.out.println("Digite o seu nome:");
			String nome = scan.next();
			
			System.out.println("Digite sua idade:");
			int idade = scan.nextInt();
		
			System.out.println("Digite o seu salário:");
			double salario = scan.nextDouble();
			
			System.out.println("Digite o seu sexo M-Masculino, F-Feminino:");
			String sexo = scan.next();
	
			System.out.println("Digite o seu estado civil S-Solteiro(a) / C-Casado(a) / V-Viuvo(a) / D-Divorciado(a):");
			String estCivil = scan.next();
			
			System.out.println("Seu nome é: " + nome);
			
			if (idade > 0 && idade <= 150) {
				idadeValido = true;
				System.out.println("Sua idade é: " + idade);
			} else {
				System.out.println("Idade inválida, por favor tente novamente!");
			}
			
			System.out.println("Seu salário é: " + salario + " reais.");
			
			if (sexo.equals("M") || sexo.equals("m")) {
				sexoValido = true;
				System.out.println("Sexo Masculino");
			} else if (sexo.equals("F") || sexo.equals("f")) {
				sexoValido = true;
				System.out.println("Sexo Feminino");
			} else {
				System.out.println("Sexo inválido, por favor tente novamente!");
			}
			
			if (estCivil.equals("S") || estCivil.equals("s")) {
				estadoCivilValido = true;
				System.out.println("Você é solteiro(a)");
			} else if (estCivil.equals("C") || estCivil.equals("c")) {
				estadoCivilValido = true;
				System.out.println("Você é casado(a)");
			} else if (estCivil.equals("V") || estCivil.equals("v")) {
				estadoCivilValido = true;
				System.out.println("Você é viúvo(a)");
			} else if (estCivil.equals("D") || estCivil.equals("d")) {
				estadoCivilValido = true;
				System.out.println("Você é divorciado(a)");
			} else {
				System.out.println("Estado Civil inválido, por favor tente novamente!");
			}
		}
	}

}
