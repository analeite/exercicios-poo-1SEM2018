package br.com.fatec.revisao.estrutura.selecao;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/*
		 * If/Else
		 * Função: a estrutura condicional if/else permite o programa avaliar
		 * uma expressão como sendo verdadeira ou falsa e de acordo com o resultado
		 * dessa verificação, executar uma ou outra rotina.
		 * Na linguagem Java, o tipo resultante dessa expressão deve ser sempre um 
		 * boolean, pois diferente das demais, o Java não converte null ou inteiros
		 * como 0 e 1 para os valores true ou false.]
		 * 
		 * Classe Scanner: permite a leitura de dados informados. O objeto System.in 
		 * é o que faz a leitura do que se escreve no teclado
		 */
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Insira um valor inteiro para o número 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Insira um valor inteiro para o número 2: ");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O número 1 é maior que o número 2!");
		}
		if(numero1 < numero2) {
			System.out.println("O número 2 é maior que o número 1!");
		}
		if(numero1 == numero2) {
			System.out.println("O número 1 é igual ao número 2!");
		}
		if(numero1 != numero2) {
			System.out.println("O número 1 é diferente do número 2!");
		}
		
		leitor.close();

	}

}
