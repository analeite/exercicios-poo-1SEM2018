package br.com.fatec.revisao.estrutura.repeticao;

import java.util.Scanner;

public class CFor {

	public static void main(String[] args) {
		/*
		 * Operadores Aritméticos
		 * Função: os operadores aritméticos são operadores binários,
		 * ou seja, funcionam com dois operandos. Por exemplo, a expressão
		 * "a + 1" contém o operador binário "+" (mais) e os dois 
		 * operandos "a" e "1".
		 * O módulo (%) fornece o resto da divisão, na expressão "x % y",
		 * o resultado é o restante depois que o x é dividido por y, sendo
		 * assim na expressão "7 % 4" o resultado é 3. Esse operador é mais
		 * utilizado com operandos inteiros, mas também pode ser utilizado 
		 * com outros tipos.
		 * Ordem de precedência: multiplicação (*), divisão (/), módulo (%),
		 * adição (+), subtração (-) e atribuição (=).
		 */
		
		Scanner leitor = new Scanner(System.in);

		boolean executar = true;

		while (executar) {
			System.out.println("Calculadora básica. Para fazer cálculos com apenas dois números.");
			System.out.println("Digite a opção que você deseja: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - MULTIPLICAÇÃO");
			System.out.println("4 - DIVISÃO");
			System.out.println("5 - SAIR");

			int opcao = leitor.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado : %d\n", numero1 + numero2);
			}
			if (opcao == 2) {
				System.out.println("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 - numero2);
			}
			if (opcao == 3) {
				System.out.println("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 * numero2);
			}
			if (opcao == 4) {
				System.out.println("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 / numero2);
			}
			if (opcao == 5) {
				executar = false;
				leitor.close();
			}
		}

	}

}
