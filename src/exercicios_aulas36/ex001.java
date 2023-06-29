package exercicios_aulas36;

import java.util.Scanner;

import curso_java_basico_aula36.Telefone;

public class ex001 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		Contato contato1 = new Contato();		
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		
		Contato[] contatos = new Contato[3]; // Criando um Array para armazenar os "objetos" "contato" que foram criados
		contatos[0] = contato1;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		Telefone telefone1 = new Telefone();
		Telefone telefone2 = new Telefone();
		Telefone telefone3 = new Telefone();
		
		Telefone[] telefones = new Telefone[3]; // Criando um Array para armazenar os "objetos" "telefone" que foram criados
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		telefones[2] = telefone3;
		
		Email email_1 = new Email();
		Email email_2 = new Email();
		Email email_3 = new Email();
		
		Email[] emails = new Email[3]; // Criando um Array para armazenar os "objetos" "email" que foram criados
		emails[0] = email_1;
		emails[1] = email_2;
		emails[2] = email_3;
		
		System.out.println("Digite o nome da Agenda:");
		agenda.setNomeAgenda(scan.nextLine());
		
		// FAZER = PEDIR 3 CONTATOS - FEITO / AGR FAZER DE MANEIRA DINÂMICA USANDO "for"
		System.out.println("Digite o nome do primeiro contato:");
		contato1.setNome(scan.nextLine());
		
		// Perguntar quantos telefones o contato tem, e registrar até 3 telefones para 1 contato!
		System.out.println("Digite o telefone do primeiro contato:");
		telefone1.setDdd(scan.next());
		telefone1.setNumero(scan.next());
		telefone1.setTipo(scan.next());
		
		// Perguntar quantos emails o contato tem, e registrar até 2 emails para 1 contato!
		System.out.println("Digite o Email do primeiro contato:");
		email_1.setNome(scan.next());
		email_1.setDominio(scan.next());
		
		
		// REPLICAR PARA OUTROS CONTATOS / CRIAR UM METODO PARA ISSO
		System.out.println("Digite o nome do segundo contato:");
		contato2.setNome(scan.nextLine());
		
		System.out.println("Digite o telefone do segundo contato:");
		telefone2.setDdd(scan.next());
		telefone2.setNumero(scan.next());
		telefone2.setTipo(scan.next());
		
		System.out.println("Digite o Email do segundo contato:");
		email_2.setNome(scan.next());
		email_2.setDominio(scan.next());
		
		System.out.println("Digite o nome do terceiro contato:");
		contato3.setNome(scan.nextLine());
		
		System.out.println("Digite o telefone do terceiro contato:");
		telefone3.setDdd(scan.next());
		telefone3.setNumero(scan.next());
		telefone3.setTipo(scan.next());
		
		System.out.println("Digite o Email do terceiro contato:");
		email_3.setNome(scan.next());
		email_3.setDominio(scan.next());
		
		// FAZER = EXIBIR INFO DA AGENDA USANDO "for"	
		System.out.println(agenda.getNomeAgenda());	
	}
}
