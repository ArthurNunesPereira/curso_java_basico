package curso_java_basico_aula24.labs;

import java.util.Date;

public class ex004 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
		
		livroDeBiblioteca.titulo = "A ilha do tesouro";
		livroDeBiblioteca.alugado = true;
		livroDeBiblioteca.alugadoPor = "Loiane";
		livroDeBiblioteca.dataEntrega = new Date();
				
				
		System.out.println("Titulo do livro: " + livroDeBiblioteca.titulo);
		if (livroDeBiblioteca.alugado == false) {
			System.out.println("O livro está disponivel.");
		} else {
			System.out.println("O livro esta alugado.");
		}
		System.out.println("O livro foi alugado por: " + livroDeBiblioteca.alugadoPor);
		System.out.println("O livro foi entregue na data: " + livroDeBiblioteca.dataEntrega);
	}
}
