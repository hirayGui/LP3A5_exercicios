package java8_aula3;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		//solicite ao usuário a entrada no último número da lista (stream) (n)
//		Scanner n = new Scanner(System.in);
//		int i = n.nextInt();
//		
//		lista.add(i);
//		n.close();

		System.out.println("\nTodos os números: ");
		lista.stream().forEach(e -> System.out.println(e));
		
		System.out.println("\nNúmeros sem repetição:");
		lista.stream().distinct().forEach(e -> System.out.println(e));
		
		System.out.println("\nTodos os números ímpares sem repetição:");
		lista.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e));
		
		System.out.println("\nTodos os números pares sem repetição:");
		lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		
		System.out.println("\nTodos os números a partir do 5 algarismo sem repetição:");
		lista.stream().skip(5).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("\nTodos os números multiplicados por 4:"); 
		lista.stream().map(e -> e * 4).forEach(e -> System.out.println(e));
	}
}
