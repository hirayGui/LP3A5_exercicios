package thread_exercicio11;

public class ContaCaracteres extends Thread{
	String texto;
	int vogal = 0, consoante = 0;
	
	public ContaCaracteres(String texto) {
		this.texto = texto;
	}
	
	@Override
	public void run() {
		
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			if(c == 32)
				continue;
			
			if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
	            vogal++;
	            continue;
	        }
			
			if(c >= 98 && c <= 122)
				consoante++;
		}
		System.out.println("Número de vogais: " + vogal);
		System.out.println("Número de consoantes: " + consoante);
	}
	
	
}
