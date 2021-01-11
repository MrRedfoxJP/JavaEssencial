package br.com.leviathan.secao12;
//Herança
public class Programa28 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro da Silva", 1987 , "silva@gmail.com");
		System.out.println(p1);
				System.out.println(p1.getNome());
				System.out.println("\n");
				
		Aluno a1 = new Aluno("Jospe Guspe", 1997, "jospinho@gmail.com",  "199099");
		System.out.println(a1);
				System.out.println(a1.getNome());
				System.out.println("\n");
				
		Professor t1 = new Professor("Caxias do Sul", 1981, "caixote@gmail.com",  "AAA123");
		System.out.println(t1);
		System.out.println(t1.getNome());
		System.out.println("\n");
		

		
}
}
