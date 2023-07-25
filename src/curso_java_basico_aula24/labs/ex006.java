package curso_java_basico_aula24.labs;

public class ex006 {

	public static void main(String[] args) {
		
		ContatoCel contatoCel = new ContatoCel();
		
		contatoCel.nome = "Richard";
		contatoCel.email = "richardjr@hotmail.com";
		contatoCel.endereco = "São Paulo";
		contatoCel.telefones = new String[3];
		
		contatoCel.telefones[0] = "(27)997999999.";
		contatoCel.telefones[1] = "(27)998888888.";
		contatoCel.telefones[2] = "(27)977777777.";
		
		System.out.println("Nome do contato: " + contatoCel.nome + ".");
		System.out.println("E-mail do contato: " + contatoCel.email + ".");
		System.out.println("Endereço do contato: " + contatoCel.endereco + ".");
		System.out.println("Todos os telefones do " + contatoCel.nome + ":");
		System.out.println("Telefone 1: " + contatoCel.telefones[0]);
		System.out.println("Telefone 2: " + contatoCel.telefones[1]);
		System.out.println("Telefone 3: " + contatoCel.telefones[2]);
	}
}
