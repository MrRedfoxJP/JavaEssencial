package br.com.leviathan.secao04;
public class Programa04 {
	public static void main(String[] args) {

		int numero = 2; // 3, 5 e 10

		/*
		 * se(numero > 5)ent�o { escreva(" Sim, o n�mero " + numero +
		 * " � maior que 5 ");
		 * 
		 * }sen�ose (numero == 5) ent�o { escreva(" O n�mero " + numero +
		 * " � igual a 5 ");
		 * 
		 * }sen�ose (numero %2 == 0)ent�o { escreva(" O n�mero " + numero +
		 * " � par ");
		 * 
		 * }sen�o { escreva(" N�o, o n�mero " + numero + " n�o � maior que 5 ");
		 * }
		 */

		if (numero > 5) {
			System.out.println(" Sim, o n�mero " + numero + " � maior que 5 ");

		} else if (numero == 5) {
			System.out.println(" O n�mero " + numero + " � igual a 5 ");

		} else if (numero % 2 == 0) {
			System.out.println(" O n�mero " + numero + " � par ");

		} else {
			System.out.println(" N�o, o n�mero " + numero
					+ " n�o � maior que 5 ");
		}
	}
}
