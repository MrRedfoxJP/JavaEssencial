package br.com.leviathan.secao09;
//Classes

//Métodos

//Construtores
/*
 - Sempre, um construtor vazio tem a seguinte forma:

 public NomeDaClasse(){

 }
 */
public class Pessoa {
	String nome, email;
	int ano_nascimento;

	// construtor vazio
	public Pessoa() {
	}

	// construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		// this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}

	void imprime_dados() {
		System.out.println("");
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de nascimento: " + this.ano_nascimento);
	}
}