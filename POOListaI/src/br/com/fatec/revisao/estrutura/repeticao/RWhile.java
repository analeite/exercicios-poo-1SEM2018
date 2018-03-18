package br.com.fatec.revisao.estrutura.repeticao;

public class RWhile {

	public static void main(String[] args) {
		/*
		 * While
		 * Função: é uma estrutura de repetição. Enquanto (while) a
		 * condição for verdadeira, os códigos entre chaves serão
		 * repetidos. Cada ciclo de repetição é chamado de iteração.
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
