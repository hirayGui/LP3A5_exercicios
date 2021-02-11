package java8_aula4;

import java.util.Optional;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		String var1 = null;//variável vazia
		String var2 = "32";//variável com valor
		
		//testando variável vazia
//		Integer numero = converteEmNumero(var1)
//				.orElseThrow(() -> new NullPointerException("Variável vazia"));
//		System.out.println(numero);
		
		//testando variável com valor
		Integer numero = converteEmNumero(var2)
				.orElseThrow(() -> new NullPointerException("Variável vazia"));
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