package br.com.leviathan.secao11;
/*
Getters e Setters

Getter
	- é um método público cuja função serve para consultar dados;
	- A nomenclatura desses métodos é getNome_do_atributo() 
 */
public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	float val_ret;
	
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
		
	}

	void sacar(float valor) {
		if(valor <= this.saldo) {
			val_ret = this.saldo = this.saldo - valor;
		}else if(valor <= (this.saldo + this.limite)) {
			val_ret = this.saldo - valor;
			//val_ret = this.limite - val_ret;
			val_ret = this.limite + val_ret;
			this.saldo = 0;
			this.limite = val_ret;
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public float getSaldo() {
		return saldo + limite;
	}

	

	

}
