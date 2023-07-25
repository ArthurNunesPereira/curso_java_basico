package curso_java_basico_aula17.labs;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean validUser = false;
		
		while (!validUser) {
			System.out.println("Digite seu usuário:");
			String user = scan.next();
			
			System.out.println("Digite sua senha:");
			String password = scan.next();
			if (user.equals(password)) {
				System.out.println("O nome de usuário e a senha não podem ser iguais, por favor tente novamente!");
			} else {
				validUser = true;
				System.out.println("Usuário criado com sucesso!");
			}
		}
	}

}
