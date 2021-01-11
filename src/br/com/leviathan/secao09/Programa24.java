package br.com.leviathan.secao09;

//Construtor

/*
 - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 - Por padr�o, a JVM - Java Virtual Machine, cria em tempo de execu��o, 
 um construtor padr�o - um construtor vazio;
 - Podemos ter mais de um construtor na classe;
 */
public class Programa24 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (M�todo) Construtor

		pessoa1.nome = "Andr� Marques";
		pessoa1.email = "marquinhos@gmail.com";
		pessoa1.ano_nascimento = 1989;
		pessoa1.imprime_dados();

		Pessoa pessoa2 = new Pessoa("Ednaldo Pereira", "pereira@gmail.com",
				1986);
		pessoa2.imprime_dados();
	}
}
