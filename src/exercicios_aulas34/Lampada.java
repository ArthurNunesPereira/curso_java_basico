package exercicios_aulas34;

public class Lampada {

	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private boolean tipoAbajur;
	
	
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return this.tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return this.garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public boolean isTipoAbajur() {
		return this.tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	boolean ligarLampada() {
		return true;
	}
	
	boolean desligarLampada() {
		return false;
	}
	
	public void exibirFichaTecnica() {
		System.out.println("Ficha tecnica da lampada: ");
		System.out.println("Modelo da lampada: " + modelo);
		System.out.println("Tensão da lampada: " + tensao);
		System.out.println("Potênica da lampada: " + potencia);
		System.out.println("Cor da lampada: " + cor);
		System.out.println("Tipo de luz da lampada: " + tipoLuz);
		System.out.println("Garantia de meses da lampada: " + garantiaMeses);
	}
}
