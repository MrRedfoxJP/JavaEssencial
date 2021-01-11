import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		int res;
		float res2;
		int numb1;
		String cont;
		int numb2;
		int op;

		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		Scanner operacao = new Scanner(System.in);
		Scanner continuar = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numb1 = num1.nextInt();
			System.out.println("Digite outro numero: ");
			numb2 = num2.nextInt();

			System.out.println("-Escolha uma op��o-");
			System.out.println("1. Soma");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. M�dulo");
			System.out.println("0. Sair");
			System.out.println("Opera��o: ");

			op = operacao.nextInt();
			if (op == 1) {
				// Soma
				res = numb1 + numb2;
				System.out.println("A soma de " + numb1 + " + " + numb2 + " � "
						+ res);
			} else if (op == 2) {
				// Subtra��o
				res = numb1 - numb2;
				System.out.println("A subtra��o de " + numb1 + " - " + numb2
						+ " � " + res);
			} else if (op == 3) {
				// Multiplica��o
				res = numb1 * numb2;
				System.out.println("A multiplica��o de " + numb1 + " * "
						+ numb2 + " � " + res);
			} else if (op == 4) {
				// Divis�o(Real)
				res2 = numb1 / numb2;
				System.out.println("A divis�o de " + numb1 + " / " + numb2
						+ " � " + res2);
			} else if (op == 5) {
				// M�dulo
				/*
				 * Se o resto do m�dulo da vari�vel por 2 for 0, a vari�vel �
				 * par. Se o resto for 1, a vari�vel � impar
				 */
				res = numb1 % 2;
				System.out.println("O resto da divis�o de " + numb1
						+ " por 2 �:" + res);
			} else if (op == 0) {
				System.out.println("Fim da opera��o!");
				break;
			}

			System.out.println("Deseja continuar a opera��o? (S/N)");

			cont = continuar.nextLine();

		} while (cont.equals("S"));
		num1.close();
		num2.close();
		operacao.close();
		continuar.close();
	}
}
