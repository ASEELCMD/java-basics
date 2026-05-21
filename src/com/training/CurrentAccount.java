package com.training;

public class CurrentAccount  extends Account {

    private double overdraftLimit;
    public CurrentAccount(int accountNumber, String customerName,
                          double balance, double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println(" Exceeds Overdraft");
        }
        
    }
 
}