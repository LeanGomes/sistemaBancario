package br.projeto.sistemaBancario;

public class Account {
	
	//Contador estático que gera números de conta únicos.
	private static int contador = 1000;
	private int numero;
	//Remete a class Client
	private Client client;
	private double saldo;
	
	public Account(Client client, double saldo) {
		super();
		this.numero = contador++;
		this.client = client;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}

	public Client getClient() {
		return client;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Métodos depositar, sacar, transferir
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		//Retorna true caso tenha dinheiro sificiente para sacar
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferiri(Account destino, double valor) {
		if(this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return "Account number : " + numero + " | Client :" + client.getNome() + " | Saldo :R$ - " + saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
