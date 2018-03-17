package br.com.fatec.revisao.impressao;

public class Printf {

	public static void main(String[] args) {
		/*
		 * Printf
		 * Função: este método é uma String de formato que pode consistir
		 * em texto fixo e especificadores de formato. A letra "f" no final
		 * da palavra "print" significa "formatted", ou seja, exibe os dados
		 * formatados.
		 * Os especificadores de formato são como marcadores de lugares para
		 * um valor, especificando o tipo de saída dos dados que iniciam com
		 * um sinal de porcentagem (%) seguido por um caractere representando
		 * seu tipo de dado. 
		 * %d = Números inteiros
		 * %f = Numeros floats
		 * %2f = Números doubles
		 * %b = Valores booleanos
		 * %c = Valores char
		 * %s = Valores String
		 */
		
		System.out.printf("%s %s", "Olá,", "Mundo!");
		
		//Saída: Olá, Mundo!

	}

}
