package exercicios_aulas24;

import java.text.DecimalFormat;

public class ex003 {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		LivroLivraria livroLivraria = new LivroLivraria();
		
		livroLivraria.titulo = "Conan o barbaro";
		livroLivraria.autor = "Hobert E. Howard";
		livroLivraria.editora = "Pipoca & Nanquim";
		livroLivraria.genero = "Fantasia";
		livroLivraria.qtdPaginas = 502;
		livroLivraria.preco = 69.90;
		
		
		System.out.println("Titulo do livro: " + livroLivraria.titulo);
		System.out.println("Autor do livro: " + livroLivraria.autor);
		System.out.println("Número de páginas: " + livroLivraria.qtdPaginas);
		System.out.println("Genero do livro: " + livroLivraria.genero);
		System.out.println("Editora: " + livroLivraria.editora);
		System.out.println("Preço do livro R$:" + formatador.format(livroLivraria.preco));
	}
}
