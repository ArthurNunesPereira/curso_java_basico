package curso_java_basico_aula43.labs.Ex003;

public class Mamifero extends Animal{

	private String alimento;

	
	
	public Mamifero() {
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
	}
	
	
}
