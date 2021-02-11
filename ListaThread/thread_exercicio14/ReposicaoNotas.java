package thread_exercicio14;

public class ReposicaoNotas implements Runnable{
	CaixaEletronico caixaeletronico = new CaixaEletronico();
	
	public ReposicaoNotas(CaixaEletronico caixaeletronico){
		this.caixaeletronico = caixaeletronico;		
	}
	
	@Override
	public void run() {
		this.caixaeletronico.repoNotas();
		
	}
}
