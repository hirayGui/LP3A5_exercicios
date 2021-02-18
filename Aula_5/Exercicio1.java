package java8_aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Gerar uma lista com 100 números aleatórios
		List<Integer> lista = getRandomNumbers(100);
		
//imprimindo lista:		
//		for (int i = 0; i < lista.size(); i++){
//            int num = lista.get(i);
//            System.out.println("Num " + i + ":   " + num);
//        }
		
		//Mostrar a soma de todos
		Optional<Integer> soma = lista.stream()
				.reduce((n1, n2) -> n1 + n2);
		
		System.out.println("Soma de todos os números: " + soma.get());
		
		//Mostrar a multiplicação de todos		
		Integer mult = lista.stream()
				.reduce(1, (n1, n2) -> n1 * n2);
		
		System.out.println("\nMultiplicação de todos os números: " + mult);
		
		//Mostrar o menor número
		Optional<Integer> menorNumero = lista.stream()
				.reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("\nMenor número: " + menorNumero.get());
		
		//Mostrar o maior número
		Optional<Integer> maiorNumero = lista.stream()
				.reduce((d1, d2) -> Math.max(d1, d2));
		System.out.println("\nMaior número: " + maiorNumero.get());
		
	}
	
	//gerando números aleatórios
	 private static ArrayList<Integer> getRandomNumbers (int sizearray)
     {
         ArrayList<Integer> numberAL = new ArrayList<Integer>();
         Random randomGenerator = new Random();

         for (int index = 0; index < sizearray; index++)
        	 numberAL.add(randomGenerator.nextInt(100));
         
         return numberAL;
     }
}
