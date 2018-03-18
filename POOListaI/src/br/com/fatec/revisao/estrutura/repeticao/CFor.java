package br.com.fatec.revisao.estrutura.repeticao;

import java.util.Scanner;

public class CFor {

	public static void main(String[] args) {
		/*
		 * Operadores Aritm�ticos
		 * Fun��o: os operadores aritm�ticos s�o operadores bin�rios,
		 * ou seja, funcionam com dois operandos. Por exemplo, a express�o
		 * "a + 1" cont�m o operador bin�rio "+" (mais) e os dois 
		 * operandos "a" e "1".
		 * O m�dulo (%) fornece o resto da divis�o, na express�o "x % y",
		 * o resultado � o restante depois que o x � dividido por y, sendo
		 * assim na express�o "7 % 4" o resultado � 3. Esse operador � mais
		 * utilizado com operandos inteiros, mas tamb�m pode ser utilizado 
		 * com outros tipos.
		 * Ordem de preced�ncia: multiplica��o (*), divis�o (/), m�dulo (%),
		 * adi��o (+), subtra��o (-) e atribui��o (=).
		 */
		
		Scanner leitor = new Scanner(System.in);

		boolean executar = true;

		while (executar) {
			System.out.println("Calculadora b�sica. Para fazer c�lculos com apenas dois n�meros.");
			System.out.println("Digite a op��o que voc� deseja: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRA��O");
			System.out.println("3 - MULTIPLICA��O");
			System.out.println("4 - DIVIS�O");
			System.out.println("5 - SAIR");

			int opcao = leitor.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o primeiro n�mero: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado : %d\n", numero1 + numero2);
			}
			if (opcao == 2) {
				System.out.println("Digite o primeiro n�mero: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 - numero2);
			}
			if (opcao == 3) {
				System.out.println("Digite o primeiro n�mero: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 * numero2);
			}
			if (opcao == 4) {
				System.out.println("Digite o primeiro n�mero: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero: ");
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
