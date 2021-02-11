package java8_aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio4 {

	//	4. Reescreva o código do exercício anterior lançando direto uma exceção caso o
	//	nome com “W” não exista (sem usar isPresent(), usando orElseThrow.
public static void main(String[] args) {
		//lista de nomes
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

		//verificando a existência de nomes começados com w
		Optional<String> nomesComW = Optional.ofNullable(lista.stream()
				.filter(e -> e.startsWith("W"))
				.findAny().orElseThrow());
		System.out.println(nomesComW);

	}


}	
