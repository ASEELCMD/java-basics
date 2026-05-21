package com.training;

public class Account {
	  protected int accountNumber;
	  protected String customerName;
	  protected double balance;

	    public Account(int accountNumber, String customerName, double balance) {
	        this.accountNumber = accountNumber;
	        this.customerName= customerName;
	        this.balance = balance;
	    }
	    
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " Dep Succ");
	    }
	    
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + " Withdrawn Succ");
	        } else {
	            System.out.println("Insufficient balance");
	        } 
	    }
	        
	        public void displayBalance() {
	            System.out.println("Account Number : " + accountNumber);
	            System.out.println("Customer Name : " + customerName);
	            System.out.println("Balance : " + balance);
	        
	 
	    }
}

