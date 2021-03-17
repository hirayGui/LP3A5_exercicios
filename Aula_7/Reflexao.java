package java8_aula7;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.logging.*;

public class Reflexao {

	public static void refletirClasse(Object obj, Class<?> classe){
		System.out.println("\nInformações da Classe:");
		
		System.out.println("\nNome da classe: " + classe.getName());
		System.out.println("Nome simples da classe: " + classe.getSimpleName());
		System.out.println("Nome canonical: " + classe.getResource(classe.getName()));
		System.out.println("Tipo da classe: " + classe.getTypeName());
		
	}
	
	public static void refletirAtributo(Object obj, Class<?> classe) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("\nAtibutos da classe: \n");
		Field[] atributos = classe.getDeclaredFields();
		for(Field F: atributos){
			F.setAccessible(true);

//modificadores de atributo
//			if(F.getType().isPrimitive())
//				F.set(obj, 0);
//			else
//				F.set(obj, null);
			
			System.out.println(F.getName() + ": " + F.getType().getTypeName() +
							  " -> valor: " + F.get(obj));
		}
	}
	
	public static void refletirMetodo(Object obj, Class<?> classe) throws IllegalArgumentException, IllegalAccessException{
		System.out.println("\nMétodos da classe: \n");
		
		Method[] metodos = classe.getDeclaredMethods();
		for(Method M: metodos) {
			System.out.println(M.getName() + 
					" -> parametros: " + Arrays.toString(M.getParameterTypes()) +
					" -> retorno: " + M.getReturnType().getSimpleName());
		}
	}
}
