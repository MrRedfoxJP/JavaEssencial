package br.com.leviathan.secao11;

public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Jonas Burguer", "Barra da Tijuca, 22");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		cli1.say_hi();
		System.out.println("");
		
		Cliente cli2 = new Cliente("Sara Pollo", "Rua da pamonha vencida, 26");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
		cli2.say_hi();
	}
}
