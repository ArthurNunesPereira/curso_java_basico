package curso_java_basico_aula43.labs.Ex003;

public class Animal {

	private String nome;
	private int comprimento;
	private int numPatas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String s = "Animal: " + nome;
        s += "\nComprimento: " + comprimento + " cm";
        s += "\nPatas: " + numPatas;
        s += "\nCor: " + cor;
        s += "\nAmbiente: " + ambiente;
        s += "\nVelocidade: " + velocidade + " m/s";
        return s;
	}
	
	
}
