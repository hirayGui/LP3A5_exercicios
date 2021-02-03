package java8_aula3;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
			
		//Crie um stream
		lista.stream()
		//Aplique um filtro mantendo apenas os números pares 
		.filter(e -> e % 2 == 0)
		//Ignores os dois primeiros números 
		.skip(2)
		//Limite o processamento aos dois primeiros números 
		.limit(2)
		//Aplique uma multiplicação por 2 em cada elemento
		.map(e -> e * 2)
		//Mostre o resultado final
		.forEach(e -> System.out.println(e));
	}
}
