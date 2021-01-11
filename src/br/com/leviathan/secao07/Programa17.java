package br.com.leviathan.secao07;
public class Programa17 {
	public static void main(String[] args) {
		// Declarando e definindo o tamanho do vetor
		int numeros[] = new int[10];

		System.out.println("Tamanho do vetor:" + numeros.length);

		for (int i = 0; i < numeros.length; i++) {
			// numeros[0] = i + 3;
			numeros[i] = i + 3;
			// numeros[9] = i + 3;

			// System.out.println(numeros[i]);

		}

		System.out.println(numeros[0]);// primeiro elemento
		System.out.println(numeros[9]);// ultimo elemento

		// 0..9
		// numeros[10] = 42;
		// System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e não podem ser
		 * aumentado/diminuído
		 */

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 10);
		}

		System.out.println(numeros[0]);// primeiro elemento
		System.out.println(numeros[9]);// ultimo elemento

		// 0...1 double
		System.out.println(Math.random());

		System.out.println(Math.random() * 10);

		System.out.println(Math.round(Math.random() * 10));

		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
