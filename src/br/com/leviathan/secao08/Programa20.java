package br.com.leviathan.secao08;
import java.util.Scanner;

public class Programa20 {
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());

		cadastrar_dados(qtd);
		mostrar_dados(qtd);

		teclado.close();

	}

	/*
	 * Uma fun��o deve ter o seguinte: a)Tipo de retorno (Tipo de dado que a
	 * fun��o vai retornar); b)Nome - Corresponde a a��o que a fun��o realiza;
	 * c)Par�metros/Argumentos de entrada (Opcional); d)Retorno (Opcional) -
	 * Depende do tipo de retorno: Void = vazio
	 */
	static void cadastrar_dados(int quantidade) {
		// Definindo o tamanho do vetor
		frutas = new String[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe a "+ (i + 1) + "fruta: ");
			frutas[i] = teclado.nextLine();

		}
	}

	static void mostrar_dados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
