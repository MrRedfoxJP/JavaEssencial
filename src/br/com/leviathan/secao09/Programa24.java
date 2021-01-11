package br.com.leviathan.secao09;

//Construtor

/*
 - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 - Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução, 
 um construtor padrão - um construtor vazio;
 - Podemos ter mais de um construtor na classe;
 */
public class Programa24 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor

		pessoa1.nome = "André Marques";
		pessoa1.email = "marquinhos@gmail.com";
		pessoa1.ano_nascimento = 1989;
		pessoa1.imprime_dados();

		Pessoa pessoa2 = new Pessoa("Ednaldo Pereira", "pereira@gmail.com",
				1986);
		pessoa2.imprime_dados();
	}
}
