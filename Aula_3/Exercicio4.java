package java8_aula3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio4 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		//Mostre somente os nomes que come�am com P
		System.out.println("\nNomes come�ados com 'P': ");
		List<String> nomesComP = lista.stream().filter(e -> e.startsWith("P")).collect(Collectors.toList());
		System.out.println(nomesComP);
				
		//Mostre todos os nomes dos clientes separados por tamanho (n�mero de caracteres)
		System.out.println("\nNomes separados por tamanho: ");
		List<String> nomesPorTamanho = lista.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).collect(Collectors.toList());		
		System.out.println(nomesPorTamanho);
		
		//Pesquise a letra inicial �A� e agrupe os nomes mostrando true e false, ou seja, liste os valores que atendem ou n�o a regra de particionamento.
		System.out.println("\nNomes agrupados em true e false que come�am com a letra 'A': ");	
		Map<Boolean, List<String>> nomesComA = lista.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).collect(Collectors.groupingBy(e -> e.startsWith("A")));
		System.out.println(nomesComA);
		
		//Mostre os nomes agrupados por tamanho, convertidos para mai�sculo e separados por v�rgula
		System.out.println("\nNomes agrupados por tamanho, convertidos para mai�sculo e separados por v�rgula: ");
		String nomesOrdenados = lista.stream().map(e -> e.toUpperCase()).sorted((a, b) -> Integer.compare(a.length(), b.length())).collect(Collectors.joining(", "));
		System.out.println(nomesOrdenados);
	}
}
