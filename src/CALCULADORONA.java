import java.util.InputMismatchException;
import java.util.Scanner;

public class CALCULADORONA {
	public static int numb1;
	public static String cont;
	public static int numb2;
	public static int op;	

	static Scanner teclado = new Scanner(System.in);
	static Scanner continuar = new Scanner(System.in);

	public static void main(String[] args) {
		calcular();
	}

	public static void calcular() {

		do {
			digitar();
			if (op == 1) {
				// Soma
				System.out.println("A soma de " + numb1 + " + " + numb2 + " é "
						+ soma(numb1, numb2));
			} else if (op == 2) {
				// Subtração
				System.out.println("A subtração de " + numb1 + " - " + numb2 + " é " 
						+ subtracao(numb1, numb2));
				;
			} else if (op == 3) {
				// Multiplicação
				System.out.println("A multiplicação de " + numb1 + " * " 
						+ numb2 + " é " + multiplicacao(numb1, numb2));
			} else if (op == 4) {
				// Divisão(Real)
				System.out.println("A divisão de " + numb1 + " / " + numb2 + " é " 
						+ divisao(numb1, numb2));
				;
			} else if (op == 5) {
				// Módulo
				/*
				 * Se o resto do módulo da variável por 2 for 0, a variável é
				 * par. Se o resto for 1, a variável é impar
				 */
				System.out.println("O resto da divisão de " + numb1 + " por 2 é:" 
						+ modulo(numb1, numb2));
				;
			} else if (op == 0) {
				System.out.println("Fim da operação!");
				break;
			}

			System.out.println("Deseja continuar a operação? (S/N)");

			cont = continuar.nextLine();

		} while (cont.toUpperCase().equals("S"));
		teclado.close();
		continuar.close();
	}

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtracao(int num1, int num2) {
		return num1 - num2;
	}

	public static float divisao(int num1, int num2) {
		return num1 / num2;
	}

	public static float modulo(int num1, int num2) {
		return num1 % num2;
	}

	public static float multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	
	public static void digitar() {
		try {
			System.out.println("Digite um numero: ");
			numb1 = teclado.nextInt();
			System.out.println("Digite outro numero: ");
			numb2 = teclado.nextInt();

			System.out.println("-Escolha uma opção-");
			System.out.println("1. Soma");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. Módulo");
			System.out.println("0. Sair");
			System.out.println("Operação: ");
	
			op = teclado.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor digite somente numeros");
		}
	}
}
