package thread_exercicio13;

public class Transferencia implements Runnable{

	private CaixaEletronico caixaeletronico;
	
	public Transferencia(CaixaEletronico caixaeletronico) {
		this.caixaeletronico = caixaeletronico;
	}
	
	@Override
	public void run() {
		this.caixaeletronico.transferencia();
		
	}

}
