package curso_java_basico_aula43.labs.Ex001;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "ContaEspecial[";
		s += " limite: " + limite;
		s += "; " + super.toString();
		s += "]";
		return s;
	}

	@Override
	public boolean sacar(double quantiaASacar) {
		double saldoComLimite = this.getSaldo() + limite;

		if ((saldoComLimite - quantiaASacar) >= 0) {
			this.setSaldo(this.getSaldo() - quantiaASacar);

			return true;
		}

		return false;
	}
}
