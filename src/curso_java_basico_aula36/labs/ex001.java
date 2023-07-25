package curso_java_basico_aula36.labs;

import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda:");
		String nomeAgenda = scan.nextLine();
		
		Agenda agenda = new Agenda(nomeAgenda);
		
		Contato[] contatos = new Contato[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i+1) + ":");
			Contato c = new Contato();
			
			System.out.println("Digite o nome do contato:");
			c.setNome(scan.nextLine());
			System.out.println("Digite o telefone do contato:");
			c.setTelefone(scan.nextLine());
			System.out.println("Digite o email do contato:");
			c.setEmail(scan.nextLine());
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.obterInfo());	
		}
	}
}
