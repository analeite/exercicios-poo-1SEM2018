package br.com.fatec.revisao.estrutura.repeticao;

public class RFor {

	public static void main(String[] args) {
		/*
		 * For
		 * Fun��o: O comando for deve ser usado sempre que se deseja 
		 * que um c�digo seja executado um determinado n�mero de vezes.
		 * A sintaxe do comando �: for(INICIALIZA��O;CONDI��O;EXPRESS�O){COMANDO(S);}
		 * Quando o comando "For" � executado, a primeira coisa a ser
		 * feita � a inicializa��o prevista. Em seguida, verifica-se se a 
		 * CONDI��O � "falsa". Em caso afirmativo, todos os comandos
		 * existentes no bloco abaixo do comando s�o executados e a
		 * opera��o prevista em EXPRESS�O � executada. Mais uma vez, a
		 * condi��o � analisada. Caso seja falsa, o loop � interrompido.
		 * Caso contr�rio, ela continua.
		 */
		
		System.out.println("**********");
		for(int quantidadeAsterisco = 8; quantidadeAsterisco > 0; quantidadeAsterisco--) {
			System.out.println("*        *");
		}
		System.out.println("**********");


	}

}
