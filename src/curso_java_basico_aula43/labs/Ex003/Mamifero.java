package curso_java_basico_aula43.labs.Ex003;

public class Mamifero extends Animal{

	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Mamifero [alimento=" + alimento + "]";
		return s;
	}
	
	
}
