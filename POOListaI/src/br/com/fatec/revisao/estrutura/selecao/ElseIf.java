package br.com.fatec.revisao.estrutura.selecao;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		/*
		 * Else If
		 * Função: complementar ao if/else, há o operador else if. Esse
		 * recurso possibilita adicionar uma nova condição à estrutura de
		 * decisão para atender a lógica sendo implementada. Pode-se utilizar
		 * quantos else if forem necessários. Entretanto, o else deve ser
		 * adicionado apenas uma vez, como alternativa caso todos os testes
		 * terem falhado.		
		 */
		Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Insira um valor inteiro para o número 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Insira um valor inteiro para o número 2: ");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O número 1 é maior do que o número 2!");	
		}
		else if(numero1 < numero2) {
			System.out.println("O número 2 é maior do que o número 1!");
		}
		if(numero1 == numero2) {
			System.out.println("O número 1 é igual ao número 2!");
		}
		else if(numero1 != numero2) {
			System.out.println("O número 1 é diferente do número 2!");
		}
		
		leitor.close();
				
		
	}

}
