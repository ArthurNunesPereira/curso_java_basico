package curso_java_basico_aula43.labs.Ex003;

public class ex003 {
	
	public static void main(String[] args) {
		
		System.out.println("------Zoologico------");
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Deserto");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso do Canada");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setAmbiente("Floresta");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = ursoDoCanada;
        
        System.out.println("-----------------------");
        for (Animal animal : animais){
            System.out.println(animal);
            System.out.println("-----------------------");
        }
	}
}

 