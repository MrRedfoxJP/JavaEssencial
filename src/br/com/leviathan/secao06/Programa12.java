package br.com.leviathan.secao06;
//Tipos de Dados
//Numéricos (Reais)
public class Programa12 {
	public static void main(String[] args) {
		// Tipos primários/primitivos
		// Por padrão, os números reais em Java são considerados double
		float preco1 = 25.2f; // (ocupa um espaço menor de memória)
		double preco2 = 25.2; // (ocupa um espaço maior de memória)

		// Tipos não primários/primitivos
		// Usados geralmente em conversões de algoritmos(String para
		// integer,etc)
		Float preco3 = 42.7f;
		Double preco4 = 42.7;

		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);

		System.out.println("float/Float: " + Float.SIZE + " bits");
		System.out.println("double/Double: " + Double.SIZE + " bits");

		System.out.println("Valor mínimo float/Float: " + Float.MIN_VALUE);
		System.out.println("Valor máximo float/Float: " + Float.MAX_VALUE);

		System.out.println("Valor mínimo double/Double: " + Double.MIN_VALUE);
		System.out.println("Valor máximo double/Double: " + Double.MAX_VALUE);

	}
}
