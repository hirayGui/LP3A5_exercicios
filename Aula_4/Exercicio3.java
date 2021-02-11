package java8_aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;	

public class Exercicio3 {


	public static void main(String[] args) {
		//lista de nomes
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

		//verificando a exist�ncia de nomes come�ados com w
		Optional<String> nomesComW = lista.stream()
				.filter(e -> e.startsWith("W"))
				.findAny();

		//passando condi��o para apresentar (ou n�o) os nomes come�ados com w
		if (nomesComW.isPresent()) {
			System.out.println("\nNomes come�ados com 'W': ");
			System.out.println(nomesComW);
		}else {
			System.out.println("N�o h� nomes come�ados com 'W'");
		}

	}


}	
