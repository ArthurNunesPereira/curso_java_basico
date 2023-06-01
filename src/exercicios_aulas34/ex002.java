package exercicios_aulas34;

public class ex002 {
	
	static void exibirValorSoma() {
		Calculadora.setNum1(1);
		Calculadora.setNum2(2);
		System.out.println("O resultado da soma de " + Calculadora.getNum1() + " + " + Calculadora.getNum2() + " é = " + Calculadora.somar(Calculadora.getNum1(), Calculadora.getNum2()) + ".");
	}

	static void exibirValorSubtracao() {
		Calculadora.setNum1(10);
		Calculadora.setNum2(2);
		System.out.println("O resultado da subtração de " + Calculadora.getNum1() + " - " + Calculadora.getNum2() + " é = " + Calculadora.subtrair(Calculadora.getNum1(), Calculadora.getNum2()) + ".");
	}
	
	static void exibirValorMultiplicacao() {
		Calculadora.setNum1(7);
		Calculadora.setNum2(5);
		System.out.println("O resultado da multiplicação de " + Calculadora.getNum1() + " * " + Calculadora.getNum2() + " é = " + Calculadora.multiplicar(Calculadora.getNum1(), Calculadora.getNum2()) + ".");
	}
	
	static void exibirValorDivisao() {
		Calculadora.setNum1(20);
		Calculadora.setNum2(2);
		System.out.println("O resultado da divisão de " + Calculadora.getNum1() + " / " + Calculadora.getNum2() + " é = " + Calculadora.dividir(Calculadora.getNum1(), Calculadora.getNum2()) + ".");
	}
	
	static void exibirValorPotencia() {
		Calculadora.setNum1(2);
		Calculadora.setNum2(5);
		System.out.println("O resultado de " + Calculadora.getNum1() + " elevado a potência " + Calculadora.getNum2() + " é = " + Calculadora.potencia(Calculadora.getNum1(), Calculadora.getNum2()) + ".");
	}
	
	public static void main(String[] args) {
		
		exibirValorSoma();
		
		exibirValorSubtracao();
		
		exibirValorMultiplicacao();
		
		exibirValorDivisao();
		
		exibirValorPotencia();
	}
}

 