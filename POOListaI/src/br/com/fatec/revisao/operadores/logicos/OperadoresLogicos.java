package br.com.fatec.revisao.operadores.logicos;

public class OperadoresLogicos {
	
	public void and (boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		System.out.println("---------AND---------");
		for (int n = 0; n < 4; n++) {
			resultado[n] = coluna1[n] && coluna2[n];
			System.out.printf("%s and %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}
	public void or (boolean[] coluna1, boolean[] coluna2, boolean resultado[]) {
		System.out.println("---------OR---------");
		for (int n = 0; n < 4; n++) {
			resultado[n] = coluna1[n] || coluna2[n];
			System.out.printf("%s or %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}
	public void not (boolean[] coluna1, boolean[] coluna2, boolean resultado[]) {
		System.out.println("---------NOT---------");
		for (int n = 0; n < 4; n++) {
			resultado[n] = !coluna1[n] && !coluna2[n];
			System.out.printf("%s not %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}

	public static void main(String[] args) {
		/*
		 * Operadores Lógicos
		 * Função: os operadores lógicos representam o recurso que nos permite criar
		 * expressões lógicas maiores a partir da junção de duas ou mais expressões. 
		 * Para isso, aplicamos as operações lógicas E (representado por "&&") e OU
		 * (representado por "||").
		 */
		boolean[] coluna1 = {true, true, false, false};
		boolean[] coluna2 = {true, false, true, false};
		boolean[] resultado = new boolean[4];
		OperadoresLogicos operadores = new OperadoresLogicos();
		
		operadores.and(coluna1, coluna2, resultado);
		operadores.or(coluna1, coluna2, resultado);
		operadores.not(coluna1, coluna2, resultado);

	}

}
