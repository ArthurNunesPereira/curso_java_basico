package curso_java_basico_aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double [] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		// Utilizando a classe "toString" do Java.
		System.out.println(aluno);
		
		// Utilizando a classe "equals" do Java.
		String s1 = "abcdef";
		String s2 = "abcdeF";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciência da Computação");
		double [] notas2 = {6, 7, 5, 9};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}
}
