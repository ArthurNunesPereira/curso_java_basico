package curso_java_basico_aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		//Pessoa aluno = new Aluno(); Não é possivel mais fazer isso pois a Classe "Pessoa" é uma classe "final"
		//Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_API);
	}
}
