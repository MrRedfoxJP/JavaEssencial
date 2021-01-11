package br.com.leviathan.secao01;
//Public

/*
 Público - Pode ser utilizado em todo o projeto;
 */
import br.com.leviathan.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cliente cli = new Cliente("Roberto Justos", "Rua das laranjas, 232");
		
		//System.out.println("Nome: " + cli.nome); ---->private
		//System.out.println("Endereço: " + cli.endereco); ----->private

		//cli.say_Hi();//protected
	}

}
