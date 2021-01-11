package br.com.leviathan.secao04;
public class Programa04 {
	public static void main(String[] args) {

		int numero = 2; // 3, 5 e 10

		/*
		 * se(numero > 5)então { escreva(" Sim, o número " + numero +
		 * " é maior que 5 ");
		 * 
		 * }senãose (numero == 5) então { escreva(" O número " + numero +
		 * " é igual a 5 ");
		 * 
		 * }senãose (numero %2 == 0)então { escreva(" O número " + numero +
		 * " é par ");
		 * 
		 * }senão { escreva(" Não, o número " + numero + " não é maior que 5 ");
		 * }
		 */

		if (numero > 5) {
			System.out.println(" Sim, o número " + numero + " é maior que 5 ");

		} else if (numero == 5) {
			System.out.println(" O número " + numero + " é igual a 5 ");

		} else if (numero % 2 == 0) {
			System.out.println(" O número " + numero + " é par ");

		} else {
			System.out.println(" Não, o número " + numero
					+ " não é maior que 5 ");
		}
	}
}
