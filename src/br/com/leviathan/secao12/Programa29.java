package br.com.leviathan.secao12;
//Sobrecarga de M�todo

/*
 - Overloading
 Ocorre quando, sobrescrevemos um m�todo na mesma classe de declara��o;
 */
public class Programa29 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		
		p1.mensagem();
		
		p1.mensagem("Kaqui");
		
		p1.mensagem("9");
	}

}
