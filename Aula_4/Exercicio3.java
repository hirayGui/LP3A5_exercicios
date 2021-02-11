package java8_aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;	

public class Exercicio3 {


	public static void main(String[] args) {
		//lista de nomes
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

		//verificando a existência de nomes começados com w
		Optional<String> nomesComW = lista.stream()
				.filter(e -> e.startsWith("W"))
				.findAny();

		//passando condição para apresentar (ou não) os nomes começados com w
		if (nomesComW.isPresent()) {
			System.out.println("\nNomes começados com 'W': ");
			System.out.println(nomesComW);
		}else {
			System.out.println("Não há nomes começados com 'W'");
		}

	}


}	
