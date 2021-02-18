package java8_aula5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		//Mostrar concatena��o dos nomes que come�am com P
		Optional<String> nomesComP = lista.stream()
				.filter(e -> e.startsWith("P"))
				.reduce((s1, s2) -> s1.concat(s2));
		
		System.out.println("Nomes come�ados com 'P': " + nomesComP.get());
		
		//Mostrar concatena��o dos nomes que come�am com A
		Optional<String> nomesComA = lista.stream()
				.filter(e -> e.startsWith("A"))
				.reduce((s1, s2) -> s1.concat(s2));
		
		System.out.println("\nNomes come�ados com 'A': " + nomesComA.get());
		
		//Mostrar concatena��o de todos os nomes
		Optional<String> todosOsNomes = lista.stream()
				.reduce((s1, s2) -> s1.concat(s2));
		
		System.out.println("\nTodos os nomes: " + todosOsNomes.get());
	}
}
