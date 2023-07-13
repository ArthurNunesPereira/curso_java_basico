package curso_java_basico_aula41;

public class Teste {

	public static void main(String[] args) {

		// Pessoa pessoa = new Pessoa(); Classe "Pessoa" não pode ser instanciada por ser uma classe abstrata!
		
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}
}
