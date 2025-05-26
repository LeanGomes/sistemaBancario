package br.projeto.sistemaBancario;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> accounts = new ArrayList<>();
	
	//Métodos
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public Account searchAccount(int numero) {
		for (Account account : accounts) {
			if (account.getNumero() == numero) {
				return account;
			}
		}
		return null;
	}
	
	public void listAccount() {
		
		if (accounts.isEmpty()) {
			System.out.println("Nenhuma Conta Cadastrada.");
		}else {
			for (Account account : accounts) {
				System.out.println(account);
			}
		}
	}

}





















