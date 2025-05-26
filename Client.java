package br.projeto.sistemaBancario;

public class Client {
	
	//Dados do cliente
	private String nome;
	private String cpf;
	
	//Construtor
	public Client(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

}
