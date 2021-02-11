package thread_exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String texto;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Programa conta caracteres\n");
		System.out.println("Insira uma frase: ");
		texto = s.nextLine();
				
		ContaCaracteres cc = new ContaCaracteres(texto);
		cc.start();
		s.close();
	}

}
