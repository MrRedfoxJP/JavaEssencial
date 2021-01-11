package br.com.leviathan.secao07;
//Arrays (vetores uni-dimensionais)
/*int vetor[5];		
 //vetor[índice];
 numeros[0] = 1; //primeiro elemento
 numeros[1] = 3; //segundo elemento
 numeros[2] = 5; //terceiro elemento
 numeros[3] = 7; //quarto elemento
 numeros[4] = 9; //quinto elemento 
 */
public class Programa16 {
	public static void main(String[] args) {

		// Declarando um vetor
		@SuppressWarnings("unused")
		int vetor[];

		// Declarando e especificando o tamanho do vetor
		@SuppressWarnings("unused")
		int numeros[] = new int[5];

		// Declarar, especificar e inicializar
		@SuppressWarnings("unused")
		int outros_numeros[] = { 1, 3, 5, 7, 9 };

		@SuppressWarnings("unused")
		float valores[] = new float[5];
		@SuppressWarnings("unused")
		char caracteres[] = new char[20];
		@SuppressWarnings("unused")
		String nomes[] = new String[4];

		String frutas[] = { "Manga", "Uva", "Maçã", "Banana" };
		System.out.println(frutas[1]);

	}
}
