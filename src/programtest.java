
public class programtest {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;

		 res = soma(valor1, valor2);
		 res = sub(valor1, valor2);
		 res = mult(valor1, valor2);
		 res = div(valor1, valor2);
		 System.out.println("O resultado é " + res);
	}

	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	static int sub(int v1, int v2) {
		return v1 - v2;
	}
	static int mult(int v1, int v2) {
		return v1 * v2;
	}
	static int div(int v1, int v2) {
		return v1 / v2;
	}
	
}