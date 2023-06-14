package curso_java_basico_aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Luffy");
		
		// Criar objeto endereço
		Endereco endereco = new Endereco();
		
		endereco.setNomeRua("Rua Dadan");
		endereco.setNumCasa("n/a");
		endereco.setCidade("Vila Foosh");
		endereco.setEstado("Reino de Goa");
		endereco.setCep("999999");
		
		contato.setEndereco(endereco); // Inserindo no "set.Edendereco" do objeto "contato", o objeto "endereco"
		
		// Criar objeto Telefone
		Telefone telefone = new Telefone();
		
		telefone.setDdd("027");
		telefone.setNumero("9999-9999");
		telefone.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		
		telefone2.setDdd("027");
		telefone2.setNumero("9999-1111");
		telefone2.setTipo("Fixo");
		
		Telefone[] telefones = new Telefone[2]; // Criando um Array para armazenar os "objetos" "telefone" que foram criados
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		contato.setTelefones(telefones); //Inserindo no "set.Telefone" do objeto "contato", o objeto "telefone"
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) { // Nesse caso estamos fazendo a checagem na mão, mas o ideal é usar os "Null-Safe Operators" para fazer essa checagem
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone tel : contato.getTelefones()) {
				System.out.println(tel.getDdd() + " " + tel.getNumero());
			}
		}
	}
}
