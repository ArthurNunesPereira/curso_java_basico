package curso_java_basico_aula43.labs.Ex003;

public class Peixe extends Animal{

	private String caracteristicas;

	
	
	public Peixe() {
		this.setNumPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinza");
		this.setCaracteristicas("Barbatanas e calda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        return s;
	}
	
	
}
