package br.com.leviathan.secao11;
//Protected (Protegido)

//É o modificador de acesso default (Padrão)
/*
- O modificador de acesso Protected faz com que 
o elemento seja visível somente dentro do mesmo pacote 
onde o elemento foi declarado.
 */
public class Cliente {
	public String nome;
	public String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	void say_hi() {
		System.out.println(this.nome + " IS SAYING hi...");
	}

	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}	
	
}
