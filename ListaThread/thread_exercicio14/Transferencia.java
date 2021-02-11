package thread_exercicio14;

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
