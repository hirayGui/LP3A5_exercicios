package java8_aula6;

public class Exercicio1Verificador {

	//método verifica valor inserido pelo usuário
	public static void Verificador(float valor) {
		//verifica se o valor é negativo
		try {
			if(valor < 0)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento negativo!");
			e.printStackTrace();
		}

		//verifica se o valor é maior que o esperado
		try {
			if(valor > 10000)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento muito grande!");
			e.printStackTrace();
		}		

		//verifica se o valor é menor que o esperado
		try {
			if(valor < 1000)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento muito pequeno!");
			e.printStackTrace();
		}

	}
}
