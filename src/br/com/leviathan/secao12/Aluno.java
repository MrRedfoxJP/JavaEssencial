package br.com.leviathan.secao12;
/* Benef�cios da Heran�a:
 * -Evita a repeti��o de c�digo;
 * -Facilita a manuten��o do programa;
 * -.......
 * 
 * - Classe espec�fica;
 * - Classe filha;
 * - Sub-classe
 */
//Aluno � uma Pessoa
/*
 * Quando uma classe herda de outra classe, ela ganha:
 * 	-TODOS os atributos e m�todos da classe herdada.
 */
public class Aluno extends Pessoa{
		private String ra;
	
		public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		
		this.ra = ra;
	}
	
	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	//Overide /Sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\nR.a :" + this.ra; 
				} 
	//Overide /Sobrescrita de m�todo
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}


}
