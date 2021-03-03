package java8_aula6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float v1, v2;
		Scanner s = new Scanner(System.in); 
		
		try {
			
			System.out.println("Insira o primeiro valor: ");
			v1 = s.nextFloat();
			Exercicio1Verificador.Verificador(v1);
			
			System.out.println("Insira o segundo valor: ");
			v2 = s.nextFloat();
			Exercicio1Verificador.Verificador(v2);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finalizada a execução do método!");
		}
		
		
		s.close();
	}
}
