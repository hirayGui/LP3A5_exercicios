package thread_exercicio14;

public class CaixaEletronico {

	public void repoNotas() {
		String s = Thread.currentThread().getName();
		int qnt = Integer.parseInt(s);

		synchronized(this) {

			System.out.println("Verificando se há notas suficientes no caixa eletrônico");
			System.out.println("Aguarde...");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if(qnt <= 15) {
				System.out.println("Quantidade de notas insuficientes!");
				System.out.println("Repondo notas. Aguarde...");
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Notas repostas!");
			} else {
				System.out.println("Notas suficientes!");
			}
			System.out.println("Processo de verificação concluído.");
		}
	}

	public void saque() {
		String qnt = Thread.currentThread().getName();

		synchronized(this) {

			System.out.println("Realizando saque no valor de R$ " + qnt);
			System.out.println("Aguarde...");
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Saque realizado!");
		}
	}

	public void transferencia() {
		String qnt = Thread.currentThread().getName();

		synchronized(this) {

			System.out.println("Realizando transferência no valor de R$ " + qnt);
			System.out.println("Aguarde...");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Transferência realizada!");
		}
	}
}
