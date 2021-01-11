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
				System.out.println("A soma de " + numb1 + " + " + numb2 + " � "
						+ soma(numb1, numb2));
			} else if (op == 2) {
				// Subtra��o
				System.out.println("A subtra��o de " + numb1 + " - " + numb2 + " � " 
						+ subtracao(numb1, numb2));
				;
			} else if (op == 3) {
				// Multiplica��o
				System.out.println("A multiplica��o de " + numb1 + " * " 
						+ numb2 + " � " + multiplicacao(numb1, numb2));
			} else if (op == 4) {
				// Divis�o(Real)
				System.out.println("A divis�o de " + numb1 + " / " + numb2 + " � " 
						+ divisao(numb1, numb2));
				;
			} else if (op == 5) {
				// M�dulo
				/*
				 * Se o resto do m�dulo da vari�vel por 2 for 0, a vari�vel �
				 * par. Se o resto for 1, a vari�vel � impar
				 */
				System.out.println("O resto da divis�o de " + numb1 + " por 2 �:" 
						+ modulo(numb1, numb2));
				;
			} else if (op == 0) {
				System.out.println("Fim da opera��o!");
				break;
			}

			System.out.println("Deseja continuar a opera��o? (S/N)");

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

			System.out.println("-Escolha uma op��o-");
			System.out.println("1. Soma");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. M�dulo");
			System.out.println("0. Sair");
			System.out.println("Opera��o: ");
	
			op = teclado.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor digite somente numeros");
		}
	}
}
