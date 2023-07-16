package curso_java_basico_aula42;

public final class Constantes {

	public static final String URL_API = "https://blablabla.com";
}

//Palavra reservada do Java "final", significa que uma classe é final, ela não pode ser alterada ou extendida (usar herança).
//Também funciona para variáveis, etc. Exemplo:
//final String valorImutavel = "valorInicial";
//valorImutavel = "novoValor";
//Permanecerá o valor declarado na variável, pois ela é do tipo "final".
//É equivalente ao "const" do Java Script / Final = Constante
	
//É comum em projetos existir uma classe constantes, com várias constantes, que são valores disponiveis que nós temos em todo projeto, e que são usados frequentemente
//	e assim outras classes poderão usar essa classe "Constantes". 
	
//OBS: Boa prática para se declarar constantes: Todos os caaracteres em maíusculo, e para separar palavras se utiliza um underscore "_".