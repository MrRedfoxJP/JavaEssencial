package br.com.leviathan.secao06;
public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 10, res;
		float res2;
		// Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

		// Subtração
		res = num1 - num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " é "
				+ res);

		// Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é "
				+ res);

		// Divisão(Inteira)
		res = num2 / num1;
		System.out.println("A divisão de " + num1 + " / " + num2 + " é " + res);

		// Divisão(Real)
		res2 = (float) num2 / (float) num1;
		System.out
				.println("A divisão de " + num1 + " / " + num2 + " é " + res2);

		// Módulo
		/*
		 * Se o resto do módulo da variável por 2 for 0, a variável é par. Se o
		 * resto for 1, a variável é impar
		 */
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + " por 2 é:" + res);

		/*
		 * Se o resultado(res) for 1, ele não é divisível por 3, se for 0, ele é
		 * divisível.
		 */
		res = num2 % 3;
		System.out.println(num2 + " é divisível por 3? " + res);
	}
}
