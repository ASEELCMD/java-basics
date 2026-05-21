package com.training;

public class BankAccount {

	public static void main(String[] args) {
		SavingsAccount savingAccount = new SavingsAccount (1234,
				"Anwar", 1500, 4);
				savingAccount.displayBalance();
				savingAccount.deposit (300); 
				savingAccount.displayBalance();
				savingAccount.withdraw (100); 
				savingAccount.displayBalance();


				
	}

}
