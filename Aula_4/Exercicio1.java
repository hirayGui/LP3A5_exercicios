package java8_aula4;

import java.util.Optional;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		String var1 = null;//variável vazia
		String var2 = "32";//variável com valor
		
		//testando optional de variável vazia e variável com valor utilizando orElse
		Integer numero = converteEmNumero(var1)
				.orElse(0);
		System.out.println(numero);
		
		numero = converteEmNumero(var2)
				.orElse(2);
		System.out.println(numero);
		
		//testando optional de variável vazia e variável com valor utilizando orElseGet
		numero = converteEmNumero(var1)
				.orElseGet(() -> 1);
		System.out.println(numero);
		
		numero = converteEmNumero(var2)
				.orElseGet(() -> 2);
		System.out.println(numero);
	}
	
	public static Optional<Integer> converteEmNumero(String numero){
		 
		try {
			Integer integer = Integer.valueOf(numero);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
	}
}
