package java8_aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio4 {

	//	4. Reescreva o c�digo do exerc�cio anterior lan�ando direto uma exce��o caso o
	//	nome com �W� n�o exista (sem usar isPresent(), usando orElseThrow.
public static void main(String[] args) {
		//lista de nomes
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

		//verificando a exist�ncia de nomes come�ados com w
		Optional<String> nomesComW = Optional.ofNullable(lista.stream()
				.filter(e -> e.startsWith("W"))
				.findAny().orElseThrow());
		System.out.println(nomesComW);

	}


}	
