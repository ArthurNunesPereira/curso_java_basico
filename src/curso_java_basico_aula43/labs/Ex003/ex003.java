package curso_java_basico_aula43.labs.Ex003;

import java.util.Scanner;

public class ex003 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		System.out.println(animal.toString());
		
		Peixe peixe = new Peixe();
		
		System.out.println(peixe.toString());
		
		Mamifero mamifero = new Mamifero();
		
		System.out.println(mamifero.toString());
	}
}

 