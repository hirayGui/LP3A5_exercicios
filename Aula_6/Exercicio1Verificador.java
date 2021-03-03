package java8_aula6;

public class Exercicio1Verificador {

	//m�todo verifica valor inserido pelo usu�rio
	public static void Verificador(float valor) {
		//verifica se o valor � negativo
		try {
			if(valor < 0)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento negativo!");
			e.printStackTrace();
		}

		//verifica se o valor � maior que o esperado
		try {
			if(valor > 10000)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento muito grande!");
			e.printStackTrace();
		}		

		//verifica se o valor � menor que o esperado
		try {
			if(valor < 1000)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("ERRO: Argumento muito pequeno!");
			e.printStackTrace();
		}

	}
}
