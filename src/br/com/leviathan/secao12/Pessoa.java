package br.com.leviathan.secao12;
/*
  - Classe Base;
  - Classe mãe;
  - Classe pai;
  - Classe genérica;
  - Super classe.
 */
public class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;

	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		super();
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
		
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return ano_nascimento;
	}
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	//Overide /Sobrescrita de método
	public String toString() {
		return "Nome: " + this.nome + " \nAno de Nascimento: " + this.ano_nascimento;
	}
	//Overload /Sobrecarga de método
	public void mensagem() {
		System.out.println("Quati");
	}

	public void mensagem(String msg) {
		System.out.println(msg);
	}
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
}
