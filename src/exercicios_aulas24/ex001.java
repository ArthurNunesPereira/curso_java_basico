package exercicios_aulas24;

public class ex001 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Quente";
		lampada.garantiaMeses = 12;
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Luminária";

		
		System.out.println(lampada);
	}
}
