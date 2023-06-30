package curso_java_basico_aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("João"); // Utilizando "Herança" = o "setNome" do atributo "nome" da classe "Pessoa", por a classe "Aluno" herdar os atributos da classe "Pessoa"	
		System.out.println(aluno.getNome());
		
		professor.setTelefoneCelular("(27)9999-9999");
		System.out.println(professor.getTelefoneCelular());
		
		/* Declarando a "SuperClasse" e instanciando o tipo da classe filha - Usado para polimorfismo
		Pessoa aluno = new Aluno(); 
		//aluno.get
		
		Pessoa professor = new Professor();
		//professor.getSala
		 */
	}
}
