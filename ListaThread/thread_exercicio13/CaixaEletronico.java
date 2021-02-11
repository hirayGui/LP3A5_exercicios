package thread_exercicio13;

public class CaixaEletronico {

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
