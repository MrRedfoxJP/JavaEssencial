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

			System.out.println("-Escolha uma opção-");
			System.out.println("1. Soma");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. Módulo");
			System.out.println("0. Sair");
			System.out.println("Operação: ");

			op = operacao.nextInt();
			if (op == 1) {
				// Soma
				res = numb1 + numb2;
				System.out.println("A soma de " + numb1 + " + " + numb2 + " é "
						+ res);
			} else if (op == 2) {
				// Subtração
				res = numb1 - numb2;
				System.out.println("A subtração de " + numb1 + " - " + numb2
						+ " é " + res);
			} else if (op == 3) {
				// Multiplicação
				res = numb1 * numb2;
				System.out.println("A multiplicação de " + numb1 + " * "
						+ numb2 + " é " + res);
			} else if (op == 4) {
				// Divisão(Real)
				res2 = numb1 / numb2;
				System.out.println("A divisão de " + numb1 + " / " + numb2
						+ " é " + res2);
			} else if (op == 5) {
				// Módulo
				/*
				 * Se o resto do módulo da variável por 2 for 0, a variável é
				 * par. Se o resto for 1, a variável é impar
				 */
				res = numb1 % 2;
				System.out.println("O resto da divisão de " + numb1
						+ " por 2 é:" + res);
			} else if (op == 0) {
				System.out.println("Fim da operação!");
				break;
			}

			System.out.println("Deseja continuar a operação? (S/N)");

			cont = continuar.nextLine();

		} while (cont.equals("S"));
		num1.close();
		num2.close();
		operacao.close();
		continuar.close();
	}
}
