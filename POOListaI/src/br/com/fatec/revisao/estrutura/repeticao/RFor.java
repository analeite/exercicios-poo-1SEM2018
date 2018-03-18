package br.com.fatec.revisao.estrutura.repeticao;

public class RFor {

	public static void main(String[] args) {
		/*
		 * For
		 * Função: O comando for deve ser usado sempre que se deseja 
		 * que um código seja executado um determinado número de vezes.
		 * A sintaxe do comando é: for(INICIALIZAÇÃO;CONDIÇÃO;EXPRESSÃO){COMANDO(S);}
		 * Quando o comando "For" é executado, a primeira coisa a ser
		 * feita é a inicialização prevista. Em seguida, verifica-se se a 
		 * CONDIÇÃO é "falsa". Em caso afirmativo, todos os comandos
		 * existentes no bloco abaixo do comando são executados e a
		 * operação prevista em EXPRESSÃO é executada. Mais uma vez, a
		 * condição é analisada. Caso seja falsa, o loop é interrompido.
		 * Caso contrário, ela continua.
		 */
		
		System.out.println("**********");
		for(int quantidadeAsterisco = 8; quantidadeAsterisco > 0; quantidadeAsterisco--) {
			System.out.println("*        *");
		}
		System.out.println("**********");


	}

}
