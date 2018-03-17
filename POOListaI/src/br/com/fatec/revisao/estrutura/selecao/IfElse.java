package br.com.fatec.revisao.estrutura.selecao;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/*
		 * If/Else
		 * Fun��o: a estrutura condicional if/else permite o programa avaliar
		 * uma express�o como sendo verdadeira ou falsa e de acordo com o resultado
		 * dessa verifica��o, executar uma ou outra rotina.
		 * Na linguagem Java, o tipo resultante dessa express�o deve ser sempre um 
		 * boolean, pois diferente das demais, o Java n�o converte null ou inteiros
		 * como 0 e 1 para os valores true ou false.]
		 * 
		 * Classe Scanner: permite a leitura de dados informados. O objeto System.in 
		 * � o que faz a leitura do que se escreve no teclado
		 */
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Insira um valor inteiro para o n�mero 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Insira um valor inteiro para o n�mero 2: ");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero 1 � maior que o n�mero 2!");
		}
		if(numero1 < numero2) {
			System.out.println("O n�mero 2 � maior que o n�mero 1!");
		}
		if(numero1 == numero2) {
			System.out.println("O n�mero 1 � igual ao n�mero 2!");
		}
		if(numero1 != numero2) {
			System.out.println("O n�mero 1 � diferente do n�mero 2!");
		}
		
		leitor.close();

	}

}
