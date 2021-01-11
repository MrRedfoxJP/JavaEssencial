package br.com.leviathan.secao12;

public class Professor extends Pessoa{
	private String matricula;

	public Professor(String nome, int ano_nascimento, String email, String matricula) {
		super(nome, ano_nascimento, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	//Overide /Sobrescrita de método
	public String toString() {
		return super.toString() + "\nMatricula :" + this.matricula; 
				} 
	//Overide /Sobrescrita de método
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}
	
}
