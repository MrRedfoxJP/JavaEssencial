package br.com.leviathan.secao06;
//Tipos de Dados
//Num�ricos (Reais)
public class Programa12 {
	public static void main(String[] args) {
		// Tipos prim�rios/primitivos
		// Por padr�o, os n�meros reais em Java s�o considerados double
		float preco1 = 25.2f; // (ocupa um espa�o menor de mem�ria)
		double preco2 = 25.2; // (ocupa um espa�o maior de mem�ria)

		// Tipos n�o prim�rios/primitivos
		// Usados geralmente em convers�es de algoritmos(String para
		// integer,etc)
		Float preco3 = 42.7f;
		Double preco4 = 42.7;

		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);

		System.out.println("float/Float: " + Float.SIZE + " bits");
		System.out.println("double/Double: " + Double.SIZE + " bits");

		System.out.println("Valor m�nimo float/Float: " + Float.MIN_VALUE);
		System.out.println("Valor m�ximo float/Float: " + Float.MAX_VALUE);

		System.out.println("Valor m�nimo double/Double: " + Double.MIN_VALUE);
		System.out.println("Valor m�ximo double/Double: " + Double.MAX_VALUE);

	}
}
