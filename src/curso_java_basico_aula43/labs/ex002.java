package curso_java_basico_aula43.labs;

public class ex002 {
	
	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Joao");
		p1.setRendaBruta(1400);
		p1.setCpf("1111");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Maria");
		p2.setRendaBruta(7000);
		p2.setCnpj("2222");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Fulano");
		p3.setRendaBruta(2500);
		p3.setCpf("3333");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Ciclano");
		p4.setRendaBruta(2000);
		p4.setCnpj("4444");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Arthur");
		p5.setRendaBruta(4200);
		p5.setCpf("5555");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Loiane");
		p6.setRendaBruta(2700);
		p6.setCnpj("6666");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;
        
        for (Contribuinte c : contribuintes) {
        	System.out.println(c.toString());
        }
	}
}

 