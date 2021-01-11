package br.com.leviathan.secao09;
//Classes:
/*
 * O nome das classes inicia com letra mai�scula;
 * O nome n�o deve conter: Acentua��o, caracteres especiais, espa�o
 * Nas classes java, n�o existe a implementa��o da fun��o main()
 * Toda classe Java possui a seguinte forma:
 * public class NomeDaClasse{
 * }
 * O nome da classe Java DEVE ser o mesmo nome do arquivo java.
 */

//Atributos:
/*
 * S�o as caracter�sticas da classe/molde/modelo de dados;
 * Podemos entender atributos como vari�veis da classe;
 * Uma outra forma de nomenclatura para os atributos s�o estados;
 * Atributos s�o nomeados em letras min�sculas, sem espa�os, sem 
 * caracteres especiais, sem acentua��o.
 */

//M�todos:
/*
 * Podemos entender os m�todos como a a��o que � realizada por um objeto da classe;
 * Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;
 * 
 * Mesmos requisitos para fun��es:
 * Uma fun��o deve ter o seguinte: 
 * a)Tipo de retorno (Tipo de dado que a fun��o vai retornar); 
 * b)Nome - Corresponde a a��o que a fun��o realiza;
 * c)Par�metros/Argumentos de entrada (Opcional); 
 * d)Retorno (Opcional) - depende do tipo de retorno) 
 * Void = vazio
 */
public class Produto {

	String nome;
	float preco;
	float desconto;
	
	//M�todo para aumentar o pre�o do projeto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
