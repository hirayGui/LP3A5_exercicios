package thread_exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CaixaEletronico ce = new CaixaEletronico();
		Scanner s = new Scanner(System.in);
		int op;
		String valor;

		System.out.println("Informe a operação que deseja realizar: " +
				"\n[1] Saque" +
				"\n[2] Transferência" +
				"\n[0] Sair");
		op = s.nextInt();
		s.nextLine();
		switch(op) {
			case 1:
				System.out.println("Informe o valor a ser sacado: ");
				valor = s.nextLine();
				Thread saque = new Thread(new Saque(ce), valor);
				saque.start();
				break;
			
			case 2:
				System.out.println("Informe o valor a ser transferido: ");
				valor = s.nextLine();
				Thread transf = new Thread(new Transferencia(ce), valor);
				transf.start();
				break;
				
			case 0:
				break;
			
			default:
				break;
		}
		s.close();
	}

}
