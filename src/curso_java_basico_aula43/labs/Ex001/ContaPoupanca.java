package curso_java_basico_aula43.labs.Ex001;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupança[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
	}
	
	public boolean calcularNovoSaldo(double taxaDeRendimento) {
		Calendar hoje = Calendar.getInstance(); // Utilizando a Classe "Calendar" do java.util
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + this.getSaldo() * taxaDeRendimento);
			return true;
		} else {
			return false;
		}
	}
}
