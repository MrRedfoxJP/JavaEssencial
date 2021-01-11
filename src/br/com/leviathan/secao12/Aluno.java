package br.com.leviathan.secao12;
/* Benefícios da Herança:
 * -Evita a repetição de código;
 * -Facilita a manutenção do programa;
 * -.......
 * 
 * - Classe específica;
 * - Classe filha;
 * - Sub-classe
 */
//Aluno é uma Pessoa
/*
 * Quando uma classe herda de outra classe, ela ganha:
 * 	-TODOS os atributos e métodos da classe herdada.
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
	//Overide /Sobrescrita de método
	public String toString() {
		return super.toString() + "\nR.a :" + this.ra; 
				} 
	//Overide /Sobrescrita de método
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}


}
