package br.com.leviathan.secao06;
public class Programa13 {

	public static void main(String[] args) {

		// Tipos primitivos
		char letra1 = 'a';// Aspas simples
		char letra2 = 97; // 97 em decimal == 'a'
		// char letra4 = "b"; //Errado

		System.out.println("Letra2 " + letra2);

		letra2 = (char) (letra2 + 1); // cast

		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);

		// Tipos n�o primitivos
		Character letra3 = 'A';
		String nome = "Universidade An�nima";

		System.out.println("Letra3 " + letra3);

		System.out.println("char/Character " + Character.SIZE + " bits");

		System.out.println("Valor m�nimo char/Character: "
				+ Character.MIN_VALUE);
		System.out.println("Valor m�ximo char/Character: "
				+ Character.MAX_VALUE);

		System.out.println("Nome: " + nome);

		System.out.println("Tamanho da String: " + nome.length());

		System.out.println("String " + (Character.SIZE * nome.length())
				+ " bits");
	}
}
