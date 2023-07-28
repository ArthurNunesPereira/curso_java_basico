package curso_java_basico_aula43.labs.Ex003;

public class Peixe extends Animal{

	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Peixe [caracteristicas=" + caracteristicas + "]";
		return s;
	}
	
	
}
