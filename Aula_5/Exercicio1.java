package java8_aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Gerar uma lista com 100 n�meros aleat�rios
		List<Integer> lista = getRandomNumbers(100);
		
//imprimindo lista:		
//		for (int i = 0; i < lista.size(); i++){
//            int num = lista.get(i);
//            System.out.println("Num " + i + ":   " + num);
//        }
		
		//Mostrar a soma de todos
		Optional<Integer> soma = lista.stream()
				.reduce((n1, n2) -> n1 + n2);
		
		System.out.println("Soma de todos os n�meros: " + soma.get());
		
		//Mostrar a multiplica��o de todos		
		Integer mult = lista.stream()
				.reduce(1, (n1, n2) -> n1 * n2);
		
		System.out.println("\nMultiplica��o de todos os n�meros: " + mult);
		
		//Mostrar o menor n�mero
		Optional<Integer> menorNumero = lista.stream()
				.reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("\nMenor n�mero: " + menorNumero.get());
		
		//Mostrar o maior n�mero
		Optional<Integer> maiorNumero = lista.stream()
				.reduce((d1, d2) -> Math.max(d1, d2));
		System.out.println("\nMaior n�mero: " + maiorNumero.get());
		
	}
	
	//gerando n�meros aleat�rios
	 private static ArrayList<Integer> getRandomNumbers (int sizearray)
     {
         ArrayList<Integer> numberAL = new ArrayList<Integer>();
         Random randomGenerator = new Random();

         for (int index = 0; index < sizearray; index++)
        	 numberAL.add(randomGenerator.nextInt(100));
         
         return numberAL;
     }
}
