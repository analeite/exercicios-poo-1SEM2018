package br.com.fatec.revisao.estrutura.repeticao;

public class RWhile {

	public static void main(String[] args) {
		/*
		 * While
		 * Fun��o: � uma estrutura de repeti��o. Enquanto (while) a
		 * condi��o for verdadeira, os c�digos entre chaves ser�o
		 * repetidos. Cada ciclo de repeti��o � chamado de itera��o.
		 */
		int quantidadeAsterisco = 8;
		System.out.println("**********");
		while (quantidadeAsterisco > 0) {
			System.out.println("*        *");
			quantidadeAsterisco--;
		}
		System.out.println("**********");
		

	}

}
