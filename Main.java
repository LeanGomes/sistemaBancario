package br.projeto.sistemaBancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		int action;
		
		do {
			System.out.println("\n --- Menu Principal ---");
			System.out.println("1. Criar nova conta");
			System.out.println("2. Consultar Saldo");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Tranferir");
			System.out.println("6 Listar Contas");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opção: ");
			action = scanner.nextInt();
			
			switch (action){
				
			case 1:
				scanner.nextLine();//Limpa buffer/linha
				
				System.out.println("Nome do cliente: ");
				String nome = scanner.nextLine();
				
				System.out.println("CPF: ");
				String cpf = scanner.nextLine();
				
				System.out.println("Saldo inicial: ");
				double saldo = scanner.nextDouble()
;
				Client client = new Client(nome, cpf);
				Account newAccount =new Account(client, saldo);
				bank.addAccount(newAccount);
				System.out.println("Conta criada: " + newAccount);
				break;
				
			case 2:
				System.out.println("Número da conta: ");
				int numQuery = scanner.nextInt();
				
				Account query = bank.searchAccount(numQuery);
				if (query != null) {
					System.out.println("Saldo: R$ " + query.getSaldo());
					
				} else {
					System.out.println("Conta não encontrada.");

				}
				break;
				
			case 3:
				System.out.println("Número da conta: ");
				int numDep = scanner.nextInt();
				System.out.println("Valor de déposito: ");
				double valueDep = scanner.nextDouble();
				Account accountDep = bank.searchAccount(numDep);
				if (accountDep != null) {
					accountDep.depositar(valueDep);
					System.out.println("Depósito realizado!!!");
					
				} else {
					System.out.println("Conta não encontrada.");

				}
				
				break;
				
			case 4:
				System.out.println("Número da conta: ");
				int numSa = scanner.nextInt();
				System.out.println("Valor do Saque: ");
				double valueSa = scanner.nextDouble();
				
				Account accountSa = bank.searchAccount(numSa);
				if (accountSa != null && accountSa.sacar(valueSa)) {
					System.out.println("Saque realizado.");
					
				} else {
					System.out.println("Saque falhou. Saldo insuficinete ou conta inválida.");

				}
				break;
			case 5:
				System.out.println("Conta origem: ");
				int source = scanner.nextInt();
				System.out.println("Conta destino: ");
				int destination = scanner.nextInt();
				
				System.out.println("Valor: ");
				double value = scanner.nextDouble()
;
				Account acSource = bank.searchAccount(source);
				Account acDestination = bank.searchAccount(destination);
				
				if(acSource != null && acDestination != null && acSource.transferiri(acDestination, value)) {
					System.out.println("TransferÊncia realizada.");
				}else {
					System.out.println("Tranferência falhou");
				}
				break;
			case 6:
				bank.listAccount();
				break;
			case 0:
				System.out.println("Encerrando....");
				break;
			default:
				System.out.println("Opção inválida.");
			}
			
		}while (action !=0);
		
		scanner.close();

	}

}
















