package java8_aula7;

public class Cliente {

	private int codigo, idade;
	private String cpf, nome, email, numero_cartao;
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumero_cartao() {
		return numero_cartao;
	}
	
	public void setNumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	
	public void getAll() {
		System.out.println("Informações do cliente: \n\nCódigo: " + this.codigo +
						   "\nCPF: " + this.cpf +
						   "\nNome: " + this.nome +
						   "\nIdade: " + this.idade +
						   "\nEmail: " + this.email +
						   "\nNúmero do cartão: " + this.numero_cartao);
	}

}
