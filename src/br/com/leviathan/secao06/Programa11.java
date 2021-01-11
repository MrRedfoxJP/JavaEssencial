package br.com.leviathan.secao06;
//Tipos de Dados
//Num�ricos (Inteiros)
public class Programa11 {
	public static void main(String[] args) {
		// Tipos prim�rios/primitivos
		long num0 = 2; // Inteiro (ocupa um espa�o gigantesco de mem�ria)
		int num1 = 2; // Inteiro (ocupa um espa�o maior de mem�ria)
		short num2 = 2; // Inteiro (ocupa um espa�o menor de mem�ria)
		byte num3 = 2; // Inteiro (ocupa um espa�o min�sculo de mem�ria)
		char num4 = 23;

		// Tipos n�o prim�rios/primitivos
		// Usados geralmente em convers�es de algoritmos(String para
		// integer,etc)
		Long num5 = (long) 88888888;// cast para atribuir o long ao valor
		Integer num6 = 42;
		Short num7 = 8;
		Byte num8 = 12;
		Character num9 = 31;

		System.out.println("long -> Num0 = " + num0);
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num3 = " + num3);
		System.out.println("char -> Num4 = " + num4);

		System.out.println("Long -> Num5 = " + num5);
		System.out.println("Integer -> Num6 = " + num6);
		System.out.println("Short -> Num7 = " + num7);
		System.out.println("Byte -> Num8 = " + num8);
		System.out.println("Character -> Num9 = " + num9);

		System.out.println("long/Long: " + Long.SIZE + " bits");
		System.out.println("int/Integer: " + Long.SIZE + " bits");
		System.out.println("short/Short: " + Long.SIZE + " bits");
		System.out.println("byte/Byte: " + Long.SIZE + " bits");
		System.out.println("char/Character: " + Long.SIZE + " bits");

		System.out.println("Valor m�nimo long/Long: " + Long.MIN_VALUE);
		System.out.println("Valor m�ximo long/Long: " + Long.MAX_VALUE);

		System.out.println("Valor m�nimo int/Integer: " + Integer.MIN_VALUE);
		System.out.println("Valor m�ximo int/Integer: " + Integer.MAX_VALUE);

		System.out.println("Valor m�nimo short/Short: " + Short.MIN_VALUE);
		System.out.println("Valor m�ximo short/Short: " + Short.MAX_VALUE);

		System.out.println("Valor m�nimo byte/Byte: " + Byte.MIN_VALUE);
		System.out.println("Valor m�ximo byte/Byte: " + Byte.MAX_VALUE);

		System.out.println("Valor m�nimo char/Character: "
				+ Character.MIN_VALUE);
		System.out.println("Valor m�ximo char/Character: "
				+ Character.MAX_VALUE);

	}
}
