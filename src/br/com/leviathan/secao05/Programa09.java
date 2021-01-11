package br.com.leviathan.secao05;
import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {

		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");

			idade = Integer.parseInt(teclado.nextLine());
			// Integer.parseInt converte String(caracter) para inteiro
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos ");
			} else {
				System.out.println("idade = 0");
			}
		}
		teclado.close();
	}
}