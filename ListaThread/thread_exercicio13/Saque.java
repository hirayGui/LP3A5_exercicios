package thread_exercicio13;

public class Saque implements Runnable{

	private CaixaEletronico caixaeletronico;

	public Saque(CaixaEletronico caixaeletronico) {
		this.caixaeletronico = caixaeletronico;
	}

	@Override
	public void run() {
		this.caixaeletronico.saque();

	}
}
