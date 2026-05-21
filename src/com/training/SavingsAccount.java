package com.training;

public class SavingsAccount extends Account {

    protected double interestRate;
    
    public SavingsAccount(int accountNumber, String customerName, double balance, double interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}
	public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " applied at " + interestRate + "%");
    }
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest Added : " + interest);
        System.out.println("New Balance : " + balance);
    }
}