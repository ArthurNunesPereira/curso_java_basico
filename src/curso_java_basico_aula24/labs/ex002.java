package curso_java_basico_aula24.labs;

public class ex002 {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.titulo = "Sherlock Holmes";
		livro.autor = "Arthur Conan Doyle";
		livro.editora = "Harper Colins";
		livro.genero = "Detetive";
		livro.qtdPaginas = 340;
		livro.anoLancamento = 2015;
		livro.isbn = "fghij";
		
		System.out.println("Titulo do livro: " + livro.titulo);
		System.out.println("Autor do livro: " + livro.autor);
		System.out.println("Número de páginas: " + livro.qtdPaginas);
		System.out.println("Codigo ISBN: " + livro.isbn);
	}
}
