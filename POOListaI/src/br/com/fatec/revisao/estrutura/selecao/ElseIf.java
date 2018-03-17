package br.com.fatec.revisao.estrutura.selecao;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		/*
		 * Else If
		 * Fun��o: complementar ao if/else, h� o operador else if. Esse
		 * recurso possibilita adicionar uma nova condi��o � estrutura de
		 * decis�o para atender a l�gica sendo implementada. Pode-se utilizar
		 * quantos else if forem necess�rios. Entretanto, o else deve ser
		 * adicionado apenas uma vez, como alternativa caso todos os testes
		 * terem falhado.		
		 */
		Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Insira um valor inteiro para o n�mero 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Insira um valor inteiro para o n�mero 2: ");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero 1 � maior do que o n�mero 2!");	
		}
		else if(numero1 < numero2) {
			System.out.println("O n�mero 2 � maior do que o n�mero 1!");
		}
		if(numero1 == numero2) {
			System.out.println("O n�mero 1 � igual ao n�mero 2!");
		}
		else if(numero1 != numero2) {
			System.out.println("O n�mero 1 � diferente do n�mero 2!");
		}
		
		leitor.close();
				
		
	}

}
