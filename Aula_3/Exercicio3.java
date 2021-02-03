package java8_aula3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		
		//Gere uma lista com 100 n�meros aleat�rios e mostre estes n�meros
		Random random = new Random();
		int[] array = random.ints(100,0,1000).toArray();
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]+ " ");
		
		System.out.println("\n\n\n");
		//Gere uma lista com 10 n�meros quaisquer
		List<Integer> lista = Arrays.asList(56, 99, 22, 9, 49, 1, 44, 88, 78, 30);
		System.out.println("Lista: " + lista);
		//Mostre o maior n�mero 
		Optional<Integer> maiorNumero = lista.stream()
				.max(Comparator.naturalOrder());
		System.out.println("\nMaior n�mero: " + maiorNumero.get());
		
		//Mostre o menor n�mero
		Optional<Integer> menorNumero = lista.stream()
				.min(Comparator.naturalOrder());
		System.out.println("\nMenor n�mero: " + menorNumero.get());
		
		//Mostre a quantidade de n�meros 
		Long qnt = lista.stream()
				.count();
		System.out.println("\nQuantidade de n�meros na lista: " + qnt);
	}
}
